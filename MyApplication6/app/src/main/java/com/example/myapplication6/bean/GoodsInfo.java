package com.example.myapplication6.bean;

import com.example.myapplication6.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "高达2009", "高达10", "高达6", "高达 R11", "高达 X9S", "高达Pro6S"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "至尊高达 荣耀上市 速到速得",
            "至尊高达 荣耀上市 速到速得）",
            "至尊高达 荣耀上市 速到速得",
            "至尊高达 荣耀上市 速到速得",
            "至尊高达 荣耀上市 速到速得",
            "至尊高达 荣耀上市 速到速得"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {688, 399, 299, 289, 268, 208};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.iphone_s, R.drawable.huawei_s, R.drawable.xiaomi_s,
            R.drawable.oppo_s, R.drawable.vivo_s, R.drawable.meizu_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.iphone, R.drawable.huawei, R.drawable.xiaomi,
            R.drawable.oppo, R.drawable.vivo, R.drawable.meizu
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
