package cn.ximcloud.itsource.test;

import java.io.IOException;
import java.io.InputStream;
import java.lang.module.ModuleReader;
import java.lang.ref.Cleaner;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.jar.Attributes;
import java.util.stream.Stream;

/**
 * Author: wzard
 * Date: 2018-09-11
 * Time: 22:06
 * ProjectName:  itsource.cn.ximcloud.itsource.test
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * //                          _ooOoo_                               //
 * //                         o8888888o                              //
 * //                         88" . "88                              //
 * //                         (| ^_^ |)                              //
 * //                         O\  =  /O                              //
 * //                      ____/`---'\____                           //
 * //                    .'  \\|     |//  `.                         //
 * //                   /  \\|||  :  |||//  \                        //
 * //                  /  _||||| -:- |||||-  \                       //
 * //                  |   | \\\  -  /// |   |                       //
 * //                  | \_|  ''\---/''  |   |                       //
 * //                  \  .-\__  `-`  ___/-. /                       //
 * //                ___`. .'  /--.--\  `. . ___                     //
 * //              ."" '<  `.___\_<|>_/___.'  >'"".                  //
 * //            | | :  `- \`.;`\ _ /`;.`/ - ` : | |                 //
 * //            \  \ `-.   \_ __\ /__ _/   .-` /  /                 //
 * //      ========`-.____`-.___\_____/___.-`____.-'========         //
 * //                           `=---='                              //
 * //      ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^        //
 * //         佛祖保佑          永无BUG     永不修改                  //
 * ////////////////////////////////////////////////////////////////////
 * YOU ARE NOT EXPECTED TO UNDERSTAND THIS CODE.
 */
public class 类加载器 {

    public static void main(String[] args) throws ClassNotFoundException {
        /**
         *     @CallerSensitive
         *     public static Class<?> forName(String className)
         *                 throws ClassNotFoundException {
         *         Class<?> caller = Reflection.getCallerClass();
         *         return forName0(className, true, ClassLoader.getClassLoader(caller), caller);
         *     }
         */
        Class.forName("");

        ClassLoader classLoader = new ClassLoader(){
            /**
             * Returns the name of this class loader or {@code null} if
             * this class loader is not named.
             *
             * @return name of this class loader; or {@code null} if
             * this class loader is not named.
             * @apiNote This method is non-final for compatibility.  If this
             * method is overridden, this method must return the same name
             * as specified when this class loader was instantiated.
             * @spec JPMS
             * @since 9
             */
            @Override
            public String getName() {
                return super.getName();
            }

            /**
             * Loads the class with the specified <a href="#name">binary name</a>.
             * This method searches for classes in the same manner as the {@link
             * #loadClass(String, boolean)} method.  It is invoked by the Java virtual
             * machine to resolve class references.  Invoking this method is equivalent
             * to invoking {@link #loadClass(String, boolean) loadClass(name,
             * false)}.
             *
             * @param name The <a href="#name">binary name</a> of the class
             * @return The resulting {@code Class} object
             * @throws ClassNotFoundException If the class was not found
             */
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                return super.loadClass(name);
            }

            /**
             * Loads the class with the specified <a href="#name">binary name</a>.  The
             * default implementation of this method searches for classes in the
             * following order:
             *
             * <ol>
             *
             * <li><p> Invoke {@link #findLoadedClass(String)} to check if the class
             * has already been loaded.  </p></li>
             *
             * <li><p> Invoke the {@link #loadClass(String) loadClass} method
             * on the parent class loader.  If the parent is {@code null} the class
             * loader built into the virtual machine is used, instead.  </p></li>
             *
             * <li><p> Invoke the {@link #findClass(String)} method to find the
             * class.  </p></li>
             *
             * </ol>
             *
             * <p> If the class was found using the above steps, and the
             * {@code resolve} flag is true, this method will then invoke the {@link
             * #resolveClass(Class)} method on the resulting {@code Class} object.
             *
             * <p> Subclasses of {@code ClassLoader} are encouraged to override {@link
             * #findClass(String)}, rather than this method.  </p>
             *
             * <p> Unless overridden, this method synchronizes on the result of
             * {@link #getClassLoadingLock getClassLoadingLock} method
             * during the entire class loading process.
             *
             * @param name    The <a href="#name">binary name</a> of the class
             * @param resolve If {@code true} then resolve the class
             * @return The resulting {@code Class} object
             * @throws ClassNotFoundException If the class could not be found
             */
            @Override
            protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
                return super.loadClass(name, resolve);
            }

            /**
             * Returns the lock object for class loading operations.
             * For backward compatibility, the default implementation of this method
             * behaves as follows. If this ClassLoader object is registered as
             * parallel capable, the method returns a dedicated object associated
             * with the specified class name. Otherwise, the method returns this
             * ClassLoader object.
             *
             * @param className The name of the to-be-loaded class
             * @return the lock for class loading operations
             * @throws NullPointerException If registered as parallel capable and {@code className} is null
             * @see #loadClass(String, boolean)
             * @since 1.7
             */
            @Override
            protected Object getClassLoadingLock(String className) {
                return super.getClassLoadingLock(className);
            }

            /**
             * Finds the class with the specified <a href="#name">binary name</a>.
             * This method should be overridden by class loader implementations that
             * follow the delegation model for loading classes, and will be invoked by
             * the {@link #loadClass loadClass} method after checking the
             * parent class loader for the requested class.
             *
             * @param name The <a href="#name">binary name</a> of the class
             * @return The resulting {@code Class} object
             * @throws ClassNotFoundException If the class could not be found
             * @implSpec The default implementation throws {@code ClassNotFoundException}.
             * @since 1.2
             */
            @Override
            protected Class<?> findClass(String name) throws ClassNotFoundException {
                return super.findClass(name);
            }

            /**
             * Finds the class with the given <a href="#name">binary name</a>
             * in a module defined to this class loader.
             * Class loader implementations that support the loading from modules
             * should override this method.
             *
             * @param moduleName The module name; or {@code null} to find the class in the
             *                   {@linkplain #getUnnamedModule() unnamed module} for this
             *                   class loader
             * @param name       The <a href="#name">binary name</a> of the class
             * @return The resulting {@code Class} object, or {@code null}
             * if the class could not be found.
             * @apiNote This method returns {@code null} rather than throwing
             * {@code ClassNotFoundException} if the class could not be found.
             * @implSpec The default implementation attempts to find the class by
             * invoking {@link #findClass(String)} when the {@code moduleName} is
             * {@code null}. It otherwise returns {@code null}.
             * @spec JPMS
             * @since 9
             */
            @Override
            protected Class<?> findClass(String moduleName, String name) {
                return super.findClass(moduleName, name);
            }

            /**
             * Returns a URL to a resource in a module defined to this class loader.
             * Class loader implementations that support the loading from modules
             * should override this method.
             *
             * @param moduleName The module name; or {@code null} to find a resource in the
             *                   {@linkplain #getUnnamedModule() unnamed module} for this
             *                   class loader
             * @param name       The resource name
             * @return A URL to the resource; {@code null} if the resource could not be
             * found, a URL could not be constructed to locate the resource,
             * access to the resource is denied by the security manager, or
             * there isn't a module of the given name defined to the class
             * loader.
             * @throws IOException If I/O errors occur
             * @apiNote This method is the basis for the {@link
             * Class#getResource Class.getResource}, {@link Class#getResourceAsStream
             * Class.getResourceAsStream}, and {@link Module#getResourceAsStream
             * Module.getResourceAsStream} methods. It is not subject to the rules for
             * encapsulation specified by {@code Module.getResourceAsStream}.
             * @implSpec The default implementation attempts to find the resource by
             * invoking {@link #findResource(String)} when the {@code moduleName} is
             * {@code null}. It otherwise returns {@code null}.
             * @spec JPMS
             * @see ModuleReader#find(String)
             * @since 9
             */
            @Override
            protected URL findResource(String moduleName, String name) throws IOException {
                return super.findResource(moduleName, name);
            }

            /**
             * Finds the resource with the given name.  A resource is some data
             * (images, audio, text, etc) that can be accessed by class code in a way
             * that is independent of the location of the code.
             *
             * <p> The name of a resource is a '{@code /}'-separated path name that
             * identifies the resource. </p>
             *
             * <p> Resources in named modules are subject to the encapsulation rules
             * specified by {@link Module#getResourceAsStream Module.getResourceAsStream}.
             * Additionally, and except for the special case where the resource has a
             * name ending with "{@code .class}", this method will only find resources in
             * packages of named modules when the package is {@link Module#isOpen(String)
             * opened} unconditionally (even if the caller of this method is in the
             * same module as the resource). </p>
             *
             * @param name The resource name
             * @return {@code URL} object for reading the resource; {@code null} if
             * the resource could not be found, a {@code URL} could not be
             * constructed to locate the resource, the resource is in a package
             * that is not opened unconditionally, or access to the resource is
             * denied by the security manager.
             * @throws NullPointerException If {@code name} is {@code null}
             * @implSpec The default implementation will first search the parent class
             * loader for the resource; if the parent is {@code null} the path of the
             * class loader built into the virtual machine is searched. If not found,
             * this method will invoke {@link #findResource(String)} to find the resource.
             * @apiNote Where several modules are defined to the same class loader,
             * and where more than one module contains a resource with the given name,
             * then the ordering that modules are searched is not specified and may be
             * very unpredictable.
             * When overriding this method it is recommended that an implementation
             * ensures that any delegation is consistent with the {@link
             * #getResources(String) getResources(String)} method.
             * @revised 9
             * @spec JPMS
             * @since 1.1
             */
            @Override
            public URL getResource(String name) {
                return super.getResource(name);
            }

            /**
             * Finds all the resources with the given name. A resource is some data
             * (images, audio, text, etc) that can be accessed by class code in a way
             * that is independent of the location of the code.
             *
             * <p> The name of a resource is a {@code /}-separated path name that
             * identifies the resource. </p>
             *
             * <p> Resources in named modules are subject to the encapsulation rules
             * specified by {@link Module#getResourceAsStream Module.getResourceAsStream}.
             * Additionally, and except for the special case where the resource has a
             * name ending with "{@code .class}", this method will only find resources in
             * packages of named modules when the package is {@link Module#isOpen(String)
             * opened} unconditionally (even if the caller of this method is in the
             * same module as the resource). </p>
             *
             * @param name The resource name
             * @return An enumeration of {@link URL URL} objects for
             * the resource. If no resources could  be found, the enumeration
             * will be empty. Resources for which a {@code URL} cannot be
             * constructed, are in package that is not opened unconditionally,
             * or access to the resource is denied by the security manager,
             * are not returned in the enumeration.
             * @throws IOException          If I/O errors occur
             * @throws NullPointerException If {@code name} is {@code null}
             * @implSpec The default implementation will first search the parent class
             * loader for the resource; if the parent is {@code null} the path of the
             * class loader built into the virtual machine is searched. It then
             * invokes {@link #findResources(String)} to find the resources with the
             * name in this class loader. It returns an enumeration whose elements
             * are the URLs found by searching the parent class loader followed by
             * the elements found with {@code findResources}.
             * @apiNote Where several modules are defined to the same class loader,
             * and where more than one module contains a resource with the given name,
             * then the ordering is not specified and may be very unpredictable.
             * When overriding this method it is recommended that an
             * implementation ensures that any delegation is consistent with the {@link
             * #getResource(String) getResource(String)} method. This should
             * ensure that the first element returned by the Enumeration's
             * {@code nextElement} method is the same resource that the
             * {@code getResource(String)} method would return.
             * @revised 9
             * @spec JPMS
             * @since 1.2
             */
            @Override
            public Enumeration<URL> getResources(String name) throws IOException {
                return super.getResources(name);
            }

            /**
             * Returns a stream whose elements are the URLs of all the resources with
             * the given name. A resource is some data (images, audio, text, etc) that
             * can be accessed by class code in a way that is independent of the
             * location of the code.
             *
             * <p> The name of a resource is a {@code /}-separated path name that
             * identifies the resource.
             *
             * <p> The resources will be located when the returned stream is evaluated.
             * If the evaluation results in an {@code IOException} then the I/O
             * exception is wrapped in an {@link UncheckedIOException} that is then
             * thrown.
             *
             * <p> Resources in named modules are subject to the encapsulation rules
             * specified by {@link Module#getResourceAsStream Module.getResourceAsStream}.
             * Additionally, and except for the special case where the resource has a
             * name ending with "{@code .class}", this method will only find resources in
             * packages of named modules when the package is {@link Module#isOpen(String)
             * opened} unconditionally (even if the caller of this method is in the
             * same module as the resource). </p>
             *
             * @param name The resource name
             * @return A stream of resource {@link URL URL} objects. If no
             * resources could  be found, the stream will be empty. Resources
             * for which a {@code URL} cannot be constructed, are in a package
             * that is not opened unconditionally, or access to the resource
             * is denied by the security manager, will not be in the stream.
             * @throws NullPointerException If {@code name} is {@code null}
             * @implSpec The default implementation invokes {@link #getResources(String)
             * getResources} to find all the resources with the given name and returns
             * a stream with the elements in the enumeration as the source.
             * @apiNote When overriding this method it is recommended that an
             * implementation ensures that any delegation is consistent with the {@link
             * #getResource(String) getResource(String)} method. This should
             * ensure that the first element returned by the stream is the same
             * resource that the {@code getResource(String)} method would return.
             * @since 9
             */
            @Override
            public Stream<URL> resources(String name) {
                return super.resources(name);
            }

            /**
             * Finds the resource with the given name. Class loader implementations
             * should override this method.
             *
             * <p> For resources in named modules then the method must implement the
             * rules for encapsulation specified in the {@code Module} {@link
             * Module#getResourceAsStream getResourceAsStream} method. Additionally,
             * it must not find non-"{@code .class}" resources in packages of named
             * modules unless the package is {@link Module#isOpen(String) opened}
             * unconditionally. </p>
             *
             * @param name The resource name
             * @return {@code URL} object for reading the resource; {@code null} if
             * the resource could not be found, a {@code URL} could not be
             * constructed to locate the resource, the resource is in a package
             * that is not opened unconditionally, or access to the resource is
             * denied by the security manager.
             * @implSpec The default implementation returns {@code null}.
             * @revised 9
             * @spec JPMS
             * @since 1.2
             */
            @Override
            protected URL findResource(String name) {
                return super.findResource(name);
            }

            /**
             * Returns an enumeration of {@link URL URL} objects
             * representing all the resources with the given name. Class loader
             * implementations should override this method.
             *
             * <p> For resources in named modules then the method must implement the
             * rules for encapsulation specified in the {@code Module} {@link
             * Module#getResourceAsStream getResourceAsStream} method. Additionally,
             * it must not find non-"{@code .class}" resources in packages of named
             * modules unless the package is {@link Module#isOpen(String) opened}
             * unconditionally. </p>
             *
             * @param name The resource name
             * @return An enumeration of {@link URL URL} objects for
             * the resource. If no resources could  be found, the enumeration
             * will be empty. Resources for which a {@code URL} cannot be
             * constructed, are in a package that is not opened unconditionally,
             * or access to the resource is denied by the security manager,
             * are not returned in the enumeration.
             * @throws IOException If I/O errors occur
             * @implSpec The default implementation returns an enumeration that
             * contains no elements.
             * @revised 9
             * @spec JPMS
             * @since 1.2
             */
            @Override
            protected Enumeration<URL> findResources(String name) throws IOException {
                return super.findResources(name);
            }

            /**
             * Returns an input stream for reading the specified resource.
             *
             * <p> The search order is described in the documentation for {@link
             * #getResource(String)}.  </p>
             *
             * <p> Resources in named modules are subject to the encapsulation rules
             * specified by {@link Module#getResourceAsStream Module.getResourceAsStream}.
             * Additionally, and except for the special case where the resource has a
             * name ending with "{@code .class}", this method will only find resources in
             * packages of named modules when the package is {@link Module#isOpen(String)
             * opened} unconditionally. </p>
             *
             * @param name The resource name
             * @return An input stream for reading the resource; {@code null} if the
             * resource could not be found, the resource is in a package that
             * is not opened unconditionally, or access to the resource is
             * denied by the security manager.
             * @throws NullPointerException If {@code name} is {@code null}
             * @revised 9
             * @spec JPMS
             * @since 1.1
             */
            @Override
            public InputStream getResourceAsStream(String name) {
                return super.getResourceAsStream(name);
            }

            /**
             * Defines a package by <a href="#name">name</a> in this {@code ClassLoader}.
             * <p>
             * <a href="#name">Package names</a> must be unique within a class loader and
             * cannot be redefined or changed once created.
             * <p>
             * If a class loader wishes to define a package with specific properties,
             * such as version information, then the class loader should call this
             * {@code definePackage} method before calling {@code defineClass}.
             * Otherwise, the
             * {@link #defineClass(String, byte[], int, int, ProtectionDomain) defineClass}
             * method will define a package in this class loader corresponding to the package
             * of the newly defined class; the properties of this defined package are
             * specified by {@link Package}.
             *
             * @param name        The <a href="#name">package name</a>
             * @param specTitle   The specification title
             * @param specVersion The specification version
             * @param specVendor  The specification vendor
             * @param implTitle   The implementation title
             * @param implVersion The implementation version
             * @param implVendor  The implementation vendor
             * @param sealBase    If not {@code null}, then this package is sealed with
             *                    respect to the given code source {@link URL URL}
             *                    object.  Otherwise, the package is not sealed.
             * @return The newly defined {@code Package} object
             * @throws NullPointerException     if {@code name} is {@code null}.
             * @throws IllegalArgumentException if a package of the given {@code name} is already
             *                                  defined by this class loader
             * @apiNote A class loader that wishes to define a package for classes in a JAR
             * typically uses the specification and implementation titles, versions, and
             * vendors from the JAR's manifest. If the package is specified as
             * {@linkplain Attributes.Name#SEALED sealed} in the JAR's manifest,
             * the {@code URL} of the JAR file is typically used as the {@code sealBase}.
             * If classes of package {@code 'p'} defined by this class loader
             * are loaded from multiple JARs, the {@code Package} object may contain
             * different information depending on the first class of package {@code 'p'}
             * defined and which JAR's manifest is read first to explicitly define
             * package {@code 'p'}.
             *
             * <p> It is strongly recommended that a class loader does not call this
             * method to explicitly define packages in <em>named modules</em>; instead,
             * the package will be automatically defined when a class is {@linkplain
             * #defineClass(String, byte[], int, int, ProtectionDomain) being defined}.
             * If it is desirable to define {@code Package} explicitly, it should ensure
             * that all packages in a named module are defined with the properties
             * specified by {@link Package}.  Otherwise, some {@code Package} objects
             * in a named module may be for example sealed with different seal base.
             * @revised 9
             * @spec JPMS
             * @jvms 5.3 Run-time package
             * @see <a href="{@docRoot}/../specs/jar/jar.html#package-sealing">
             * The JAR File Specification: Package Sealing</a>
             * @since 1.2
             */
            @Override
            protected Package definePackage(String name, String specTitle, String specVersion, String specVendor, String implTitle, String implVersion, String implVendor, URL sealBase) {
                return super.definePackage(name, specTitle, specVersion, specVendor, implTitle, implVersion, implVendor, sealBase);
            }

            /**
             * Finds a package by <a href="#name">name</a> in this class loader and its ancestors.
             * <p>
             * If this class loader defines a {@code Package} of the given name,
             * the {@code Package} is returned. Otherwise, the ancestors of
             * this class loader are searched recursively (parent by parent)
             * for a {@code Package} of the given name.
             *
             * @param name The <a href="#name">package name</a>
             * @return The {@code Package} of the given name that has been defined by
             * this class loader or its ancestors, or {@code null} if not found.
             * @throws NullPointerException if {@code name} is {@code null}.
             * @apiNote The {@link #getPlatformClassLoader() platform class loader}
             * may delegate to the application class loader but the application class
             * loader is not its ancestor.  When invoked on the platform class loader,
             * this method  will not find packages defined to the application
             * class loader.
             * @revised 9
             * @spec JPMS
             * @see ClassLoader#getDefinedPackage(String)
             * @since 1.2
             * @deprecated If multiple class loaders delegate to each other and define classes
             * with the same package name, and one such loader relies on the lookup
             * behavior of {@code getPackage} to return a {@code Package} from
             * a parent loader, then the properties exposed by the {@code Package}
             * may not be as expected in the rest of the program.
             * For example, the {@code Package} will only expose annotations from the
             * {@code package-info.class} file defined by the parent loader, even if
             * annotations exist in a {@code package-info.class} file defined by
             * a child loader.  A more robust approach is to use the
             * {@link ClassLoader#getDefinedPackage} method which returns
             * a {@code Package} for the specified class loader.
             */
            @Override
            protected Package getPackage(String name) {
                return super.getPackage(name);
            }

            /**
             * Returns all of the {@code Package}s that have been defined by
             * this class loader and its ancestors.  The returned array may contain
             * more than one {@code Package} object of the same package name, each
             * defined by a different class loader in the class loader hierarchy.
             *
             * @return The array of {@code Package} objects that have been defined by
             * this class loader and its ancestors
             * @apiNote The {@link #getPlatformClassLoader() platform class loader}
             * may delegate to the application class loader. In other words,
             * packages in modules defined to the application class loader may be
             * visible to the platform class loader.  On the other hand,
             * the application class loader is not its ancestor and hence
             * when invoked on the platform class loader, this method will not
             * return any packages defined to the application class loader.
             * @revised 9
             * @spec JPMS
             * @see ClassLoader#getDefinedPackages()
             * @since 1.2
             */
            @Override
            protected Package[] getPackages() {
                return super.getPackages();
            }

            /**
             * Returns the absolute path name of a native library.  The VM invokes this
             * method to locate the native libraries that belong to classes loaded with
             * this class loader. If this method returns {@code null}, the VM
             * searches the library along the path specified as the
             * "{@code java.library.path}" property.
             *
             * @param libname The library name
             * @return The absolute path of the native library
             * @see System#loadLibrary(String)
             * @see System#mapLibraryName(String)
             * @since 1.2
             */
            @Override
            protected String findLibrary(String libname) {
                return super.findLibrary(libname);
            }

            /**
             * Sets the default assertion status for this class loader.  This setting
             * determines whether classes loaded by this class loader and initialized
             * in the future will have assertions enabled or disabled by default.
             * This setting may be overridden on a per-package or per-class basis by
             * invoking {@link #setPackageAssertionStatus(String, boolean)} or {@link
             * #setClassAssertionStatus(String, boolean)}.
             *
             * @param enabled {@code true} if classes loaded by this class loader will
             *                henceforth have assertions enabled by default, {@code false}
             *                if they will have assertions disabled by default.
             * @since 1.4
             */
            @Override
            public void setDefaultAssertionStatus(boolean enabled) {
                super.setDefaultAssertionStatus(enabled);
            }

            /**
             * Sets the package default assertion status for the named package.  The
             * package default assertion status determines the assertion status for
             * classes initialized in the future that belong to the named package or
             * any of its "subpackages".
             *
             * <p> A subpackage of a package named p is any package whose name begins
             * with "{@code p.}".  For example, {@code javax.swing.text} is a
             * subpackage of {@code javax.swing}, and both {@code java.util} and
             * {@code java.lang.reflect} are subpackages of {@code java}.
             *
             * <p> In the event that multiple package defaults apply to a given class,
             * the package default pertaining to the most specific package takes
             * precedence over the others.  For example, if {@code javax.lang} and
             * {@code javax.lang.reflect} both have package defaults associated with
             * them, the latter package default applies to classes in
             * {@code javax.lang.reflect}.
             *
             * <p> Package defaults take precedence over the class loader's default
             * assertion status, and may be overridden on a per-class basis by invoking
             * {@link #setClassAssertionStatus(String, boolean)}.  </p>
             *
             * @param packageName The name of the package whose package default assertion status
             *                    is to be set. A {@code null} value indicates the unnamed
             *                    package that is "current"
             *                    (see section 7.4.2 of
             *                    <cite>The Java&trade; Language Specification</cite>.)
             * @param enabled     {@code true} if classes loaded by this classloader and
             *                    belonging to the named package or any of its subpackages will
             *                    have assertions enabled by default, {@code false} if they will
             *                    have assertions disabled by default.
             * @since 1.4
             */
            @Override
            public void setPackageAssertionStatus(String packageName, boolean enabled) {
                super.setPackageAssertionStatus(packageName, enabled);
            }

            /**
             * Sets the desired assertion status for the named top-level class in this
             * class loader and any nested classes contained therein.  This setting
             * takes precedence over the class loader's default assertion status, and
             * over any applicable per-package default.  This method has no effect if
             * the named class has already been initialized.  (Once a class is
             * initialized, its assertion status cannot change.)
             *
             * <p> If the named class is not a top-level class, this invocation will
             * have no effect on the actual assertion status of any class. </p>
             *
             * @param className The fully qualified class name of the top-level class whose
             *                  assertion status is to be set.
             * @param enabled   {@code true} if the named class is to have assertions
             *                  enabled when (and if) it is initialized, {@code false} if the
             *                  class is to have assertions disabled.
             * @since 1.4
             */
            @Override
            public void setClassAssertionStatus(String className, boolean enabled) {
                super.setClassAssertionStatus(className, enabled);
            }

            /**
             * Sets the default assertion status for this class loader to
             * {@code false} and discards any package defaults or class assertion
             * status settings associated with the class loader.  This method is
             * provided so that class loaders can be made to ignore any command line or
             * persistent assertion status settings and "start with a clean slate."
             *
             * @since 1.4
             */
            @Override
            public void clearAssertionStatus() {
                super.clearAssertionStatus();
            }

            /**
             * Returns a hash code value for the object. This method is
             * supported for the benefit of hash tables such as those provided by
             * {@link HashMap}.
             * <p>
             * The general contract of {@code hashCode} is:
             * <ul>
             * <li>Whenever it is invoked on the same object more than once during
             * an execution of a Java application, the {@code hashCode} method
             * must consistently return the same integer, provided no information
             * used in {@code equals} comparisons on the object is modified.
             * This integer need not remain consistent from one execution of an
             * application to another execution of the same application.
             * <li>If two objects are equal according to the {@code equals(Object)}
             * method, then calling the {@code hashCode} method on each of
             * the two objects must produce the same integer result.
             * <li>It is <em>not</em> required that if two objects are unequal
             * according to the {@link Object#equals(Object)}
             * method, then calling the {@code hashCode} method on each of the
             * two objects must produce distinct integer results.  However, the
             * programmer should be aware that producing distinct integer results
             * for unequal objects may improve the performance of hash tables.
             * </ul>
             * <p>
             * As much as is reasonably practical, the hashCode method defined
             * by class {@code Object} does return distinct integers for
             * distinct objects. (The hashCode may or may not be implemented
             * as some function of an object's memory address at some point
             * in time.)
             *
             * @return a hash code value for this object.
             * @see Object#equals(Object)
             * @see System#identityHashCode
             */
            @Override
            public int hashCode() {
                return super.hashCode();
            }

            /**
             * Indicates whether some other object is "equal to" this one.
             * <p>
             * The {@code equals} method implements an equivalence relation
             * on non-null object references:
             * <ul>
             * <li>It is <i>reflexive</i>: for any non-null reference value
             * {@code x}, {@code x.equals(x)} should return
             * {@code true}.
             * <li>It is <i>symmetric</i>: for any non-null reference values
             * {@code x} and {@code y}, {@code x.equals(y)}
             * should return {@code true} if and only if
             * {@code y.equals(x)} returns {@code true}.
             * <li>It is <i>transitive</i>: for any non-null reference values
             * {@code x}, {@code y}, and {@code z}, if
             * {@code x.equals(y)} returns {@code true} and
             * {@code y.equals(z)} returns {@code true}, then
             * {@code x.equals(z)} should return {@code true}.
             * <li>It is <i>consistent</i>: for any non-null reference values
             * {@code x} and {@code y}, multiple invocations of
             * {@code x.equals(y)} consistently return {@code true}
             * or consistently return {@code false}, provided no
             * information used in {@code equals} comparisons on the
             * objects is modified.
             * <li>For any non-null reference value {@code x},
             * {@code x.equals(null)} should return {@code false}.
             * </ul>
             * <p>
             * The {@code equals} method for class {@code Object} implements
             * the most discriminating possible equivalence relation on objects;
             * that is, for any non-null reference values {@code x} and
             * {@code y}, this method returns {@code true} if and only
             * if {@code x} and {@code y} refer to the same object
             * ({@code x == y} has the value {@code true}).
             * <p>
             * Note that it is generally necessary to override the {@code hashCode}
             * method whenever this method is overridden, so as to maintain the
             * general contract for the {@code hashCode} method, which states
             * that equal objects must have equal hash codes.
             *
             * @param obj the reference object with which to compare.
             * @return {@code true} if this object is the same as the obj
             * argument; {@code false} otherwise.
             * @see #hashCode()
             * @see HashMap
             */
            @Override
            public boolean equals(Object obj) {
                return super.equals(obj);
            }

            /**
             * Creates and returns a copy of this object.  The precise meaning
             * of "copy" may depend on the class of the object. The general
             * intent is that, for any object {@code x}, the expression:
             * <blockquote>
             * <pre>
             * x.clone() != x</pre></blockquote>
             * will be true, and that the expression:
             * <blockquote>
             * <pre>
             * x.clone().getClass() == x.getClass()</pre></blockquote>
             * will be {@code true}, but these are not absolute requirements.
             * While it is typically the case that:
             * <blockquote>
             * <pre>
             * x.clone().equals(x)</pre></blockquote>
             * will be {@code true}, this is not an absolute requirement.
             * <p>
             * By convention, the returned object should be obtained by calling
             * {@code super.clone}.  If a class and all of its superclasses (except
             * {@code Object}) obey this convention, it will be the case that
             * {@code x.clone().getClass() == x.getClass()}.
             * <p>
             * By convention, the object returned by this method should be independent
             * of this object (which is being cloned).  To achieve this independence,
             * it may be necessary to modify one or more fields of the object returned
             * by {@code super.clone} before returning it.  Typically, this means
             * copying any mutable objects that comprise the internal "deep structure"
             * of the object being cloned and replacing the references to these
             * objects with references to the copies.  If a class contains only
             * primitive fields or references to immutable objects, then it is usually
             * the case that no fields in the object returned by {@code super.clone}
             * need to be modified.
             * <p>
             * The method {@code clone} for class {@code Object} performs a
             * specific cloning operation. First, if the class of this object does
             * not implement the interface {@code Cloneable}, then a
             * {@code CloneNotSupportedException} is thrown. Note that all arrays
             * are considered to implement the interface {@code Cloneable} and that
             * the return type of the {@code clone} method of an array type {@code T[]}
             * is {@code T[]} where T is any reference or primitive type.
             * Otherwise, this method creates a new instance of the class of this
             * object and initializes all its fields with exactly the contents of
             * the corresponding fields of this object, as if by assignment; the
             * contents of the fields are not themselves cloned. Thus, this method
             * performs a "shallow copy" of this object, not a "deep copy" operation.
             * <p>
             * The class {@code Object} does not itself implement the interface
             * {@code Cloneable}, so calling the {@code clone} method on an object
             * whose class is {@code Object} will result in throwing an
             * exception at run time.
             *
             * @return a clone of this instance.
             * @throws CloneNotSupportedException if the object's class does not
             *                                    support the {@code Cloneable} interface. Subclasses
             *                                    that override the {@code clone} method can also
             *                                    throw this exception to indicate that an instance cannot
             *                                    be cloned.
             * @see Cloneable
             */
            @Override
            protected Object clone() throws CloneNotSupportedException {
                return super.clone();
            }

            /**
             * Returns a string representation of the object. In general, the
             * {@code toString} method returns a string that
             * "textually represents" this object. The result should
             * be a concise but informative representation that is easy for a
             * person to read.
             * It is recommended that all subclasses override this method.
             * <p>
             * The {@code toString} method for class {@code Object}
             * returns a string consisting of the name of the class of which the
             * object is an instance, the at-sign character `{@code @}', and
             * the unsigned hexadecimal representation of the hash code of the
             * object. In other words, this method returns a string equal to the
             * value of:
             * <blockquote>
             * <pre>
             * getClass().getName() + '@' + Integer.toHexString(hashCode())
             * </pre></blockquote>
             *
             * @return a string representation of the object.
             */
            @Override
            public String toString() {
                return super.toString();
            }

            /**
             * Called by the garbage collector on an object when garbage collection
             * determines that there are no more references to the object.
             * A subclass overrides the {@code finalize} method to dispose of
             * system resources or to perform other cleanup.
             * <p>
             * The general contract of {@code finalize} is that it is invoked
             * if and when the Java&trade; virtual
             * machine has determined that there is no longer any
             * means by which this object can be accessed by any thread that has
             * not yet died, except as a result of an action taken by the
             * finalization of some other object or class which is ready to be
             * finalized. The {@code finalize} method may take any action, including
             * making this object available again to other threads; the usual purpose
             * of {@code finalize}, however, is to perform cleanup actions before
             * the object is irrevocably discarded. For example, the finalize method
             * for an object that represents an input/output connection might perform
             * explicit I/O transactions to break the connection before the object is
             * permanently discarded.
             * <p>
             * The {@code finalize} method of class {@code Object} performs no
             * special action; it simply returns normally. Subclasses of
             * {@code Object} may override this definition.
             * <p>
             * The Java programming language does not guarantee which thread will
             * invoke the {@code finalize} method for any given object. It is
             * guaranteed, however, that the thread that invokes finalize will not
             * be holding any user-visible synchronization locks when finalize is
             * invoked. If an uncaught exception is thrown by the finalize method,
             * the exception is ignored and finalization of that object terminates.
             * <p>
             * After the {@code finalize} method has been invoked for an object, no
             * further action is taken until the Java virtual machine has again
             * determined that there is no longer any means by which this object can
             * be accessed by any thread that has not yet died, including possible
             * actions by other objects or classes which are ready to be finalized,
             * at which point the object may be discarded.
             * <p>
             * The {@code finalize} method is never invoked more than once by a Java
             * virtual machine for any given object.
             * <p>
             * Any exception thrown by the {@code finalize} method causes
             * the finalization of this object to be halted, but is otherwise
             * ignored.
             *
             * @throws Throwable the {@code Exception} raised by this method
             * @apiNote Classes that embed non-heap resources have many options
             * for cleanup of those resources. The class must ensure that the
             * lifetime of each instance is longer than that of any resource it embeds.
             * {@link Reference#reachabilityFence} can be used to ensure that
             * objects remain reachable while resources embedded in the object are in use.
             * <p>
             * A subclass should avoid overriding the {@code finalize} method
             * unless the subclass embeds non-heap resources that must be cleaned up
             * before the instance is collected.
             * Finalizer invocations are not automatically chained, unlike constructors.
             * If a subclass overrides {@code finalize} it must invoke the superclass
             * finalizer explicitly.
             * To guard against exceptions prematurely terminating the finalize chain,
             * the subclass should use a {@code try-finally} block to ensure
             * {@code super.finalize()} is always invoked. For example,
             * <pre>{@code      @Override
             *     protected void finalize() throws Throwable {
             *         try {
             *             ... // cleanup subclass state
             *         } finally {
             *             super.finalize();
             *         }
             *     }
             * }</pre>
             * @jls 12.6 Finalization of Class Instances
             * @see WeakReference
             * @see PhantomReference
             * @deprecated The finalization mechanism is inherently problematic.
             * Finalization can lead to performance issues, deadlocks, and hangs.
             * Errors in finalizers can lead to resource leaks; there is no way to cancel
             * finalization if it is no longer necessary; and no ordering is specified
             * among calls to {@code finalize} methods of different objects.
             * Furthermore, there are no guarantees regarding the timing of finalization.
             * The {@code finalize} method might be called on a finalizable object
             * only after an indefinite delay, if at all.
             * <p>
             * Classes whose instances hold non-heap resources should provide a method
             * to enable explicit release of those resources, and they should also
             * implement {@link AutoCloseable} if appropriate.
             * The {@link Cleaner} and {@link PhantomReference}
             * provide more flexible and efficient ways to release resources when an object
             * becomes unreachable.
             */
            @Override
            protected void finalize() throws Throwable {
                super.finalize();
            }
        };
    }
}
