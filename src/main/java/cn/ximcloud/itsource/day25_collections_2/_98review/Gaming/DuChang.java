package cn.ximcloud.itsource.day25_collections_2._98review.Gaming;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-13
 * Time: 12:24
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class DuChang {
    private String name;
    private Integer size;
    private DuZhuo[] duZhuos;

    public DuChang() {

    }


    public DuChang(String name) {
        this.name = name;
    }

    public DuChang(String name, Integer size) {
        this.name = name;
        this.size = size;
        this.duZhuos = new DuZhuo[size];
    }

    public DuZhuo[] getDuZhuos() {
        return duZhuos;
    }

    public void setDuZhuos(DuZhuo[] duZhuos) {
        this.duZhuos = duZhuos;
    }

    public DuZhuo getDuZhuo(Integer integer) {
        return duZhuos[integer];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        if (duZhuos == null) {
            duZhuos = new DuZhuo[size];
            for (int i = 0; i < duZhuos.length; i++) {
                duZhuos[i] = new DuZhuo();
            }
            this.size = size;
        } else if (duZhuos.length > size) {
            throw new ArrayIndexOutOfBoundsException("赌场已存在赌桌，且当前设置的赌桌小于已存在的赌桌");
        } else {
            DuZhuo[] temp = new DuZhuo[size];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = new DuZhuo();
            }
            System.arraycopy(duZhuos, 0, temp, 0, duZhuos.length);
            duZhuos = temp;
        }
    }


}
