package com.lzf.demo.demo.resp;

import com.lzf.demo.demo.req.BrandReq;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 写点注释
 * <br/>
 * Created in 2019-03-17 16:04:02
 * <br/>
 *
 * @author Li Zhenrfeng
 */
public class TestUserResp implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 可以自动解析的基本数据类型 示例如下
     */
    private long aLong;
    private long[] longs;
    private int anInt;
    private int[] ings;
    private short aShort;
    private short[] shorts;
    private float aFloat;
    private float[] floats;
    private double aDouble;
    private double[] doubles;
    private byte aByte;
    private byte[] bytes;
    private boolean aBoolean;
    private boolean[] booleans;
    private char aChar;
    private char[] chars;

    /**
     * 可以自动解析的基本类型包装类 示例如下
     */
    private Long aObjectLong;
    private Long[] objectLongs;
    private Integer anObjectInt;
    private Integer[] objectIngs;
    private Short aObjectShort;
    private Short[] objecSshorts;
    private Float aObjectFloat;
    private Float[] objectFloats;
    private Double aObjectDouble;
    private Double[] objectDoubles;
    private Byte aObjectByte;
    private Byte[] objectBytes;
    private Boolean aObjectBoolean;
    private Boolean[] objectBooleans;
    private Character aObjectChar;
    private Character[] objectChars;

    /**
     * 可以自动解析的字符串类型 示例如下
     */
    private String string;
    private String[] strings;

    /**
     * 可以自动解析的简单集合类型 示例如下
     */
    private Character[] arrayCharacters;
    private BrandReq[] arrayBrandReq;
    private Collection<Integer> integerCollection;
    private List<String> stringList;
    private Set<Double> doubleSet;

    /**
     * 可以自动解析的复杂集合类型 示例如下
     */
    private String[][] arrayArrayString;
    private Collection<List<Short>> listCollectionShort;
    private Collection<BrandReq> collectionBrandReq;
    private Collection<BrandReq[]> collectionArrayBrandReq;
    private Collection<boolean[]> collectionBoolean;
    private Collection<Collection<Float[]>> collectionCollectionArrayFloat;
    private Collection<Set<List<Long[]>>> collectionSetListArrayLong;

    /**
     * 不支持的类型示例如下  < 集合类型的数组 >暂时不支持自动解析，如项目需要，则需要@API标签配合使用
     */
    private Collection<Integer[]>[] arrayCollectionArrayInteger;
    private Collection<Integer>[] arrayCollectionInteger;

    /**
     * Map因为无法获取key值故无法解析，建议减少使用，如项目需要，则需要@API标签配合使用
     */
    private Map<String, Object> objectMap;
    private Set<List<Map<String, Object>>> setListMapObject;

    public long getaLong() {
        return aLong;
    }

    public void setaLong(long aLong) {
        this.aLong = aLong;
    }

    public long[] getLongs() {
        return longs;
    }

    public void setLongs(long[] longs) {
        this.longs = longs;
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public int[] getIngs() {
        return ings;
    }

    public void setIngs(int[] ings) {
        this.ings = ings;
    }

    public short getaShort() {
        return aShort;
    }

    public void setaShort(short aShort) {
        this.aShort = aShort;
    }

    public short[] getShorts() {
        return shorts;
    }

    public void setShorts(short[] shorts) {
        this.shorts = shorts;
    }

    public float getaFloat() {
        return aFloat;
    }

    public void setaFloat(float aFloat) {
        this.aFloat = aFloat;
    }

    public float[] getFloats() {
        return floats;
    }

    public void setFloats(float[] floats) {
        this.floats = floats;
    }

    public double getaDouble() {
        return aDouble;
    }

    public void setaDouble(double aDouble) {
        this.aDouble = aDouble;
    }

    public double[] getDoubles() {
        return doubles;
    }

    public void setDoubles(double[] doubles) {
        this.doubles = doubles;
    }

    public byte getaByte() {
        return aByte;
    }

    public void setaByte(byte aByte) {
        this.aByte = aByte;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

    public boolean isaBoolean() {
        return aBoolean;
    }

    public void setaBoolean(boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

    public boolean[] getBooleans() {
        return booleans;
    }

    public void setBooleans(boolean[] booleans) {
        this.booleans = booleans;
    }

    public char getaChar() {
        return aChar;
    }

    public void setaChar(char aChar) {
        this.aChar = aChar;
    }

    public char[] getChars() {
        return chars;
    }

    public void setChars(char[] chars) {
        this.chars = chars;
    }

    public Long getaObjectLong() {
        return aObjectLong;
    }

    public void setaObjectLong(Long aObjectLong) {
        this.aObjectLong = aObjectLong;
    }

    public Long[] getObjectLongs() {
        return objectLongs;
    }

    public void setObjectLongs(Long[] objectLongs) {
        this.objectLongs = objectLongs;
    }

    public Integer getAnObjectInt() {
        return anObjectInt;
    }

    public void setAnObjectInt(Integer anObjectInt) {
        this.anObjectInt = anObjectInt;
    }

    public Integer[] getObjectIngs() {
        return objectIngs;
    }

    public void setObjectIngs(Integer[] objectIngs) {
        this.objectIngs = objectIngs;
    }

    public Short getaObjectShort() {
        return aObjectShort;
    }

    public void setaObjectShort(Short aObjectShort) {
        this.aObjectShort = aObjectShort;
    }

    public Short[] getObjecSshorts() {
        return objecSshorts;
    }

    public void setObjecSshorts(Short[] objecSshorts) {
        this.objecSshorts = objecSshorts;
    }

    public Float getaObjectFloat() {
        return aObjectFloat;
    }

    public void setaObjectFloat(Float aObjectFloat) {
        this.aObjectFloat = aObjectFloat;
    }

    public Float[] getObjectFloats() {
        return objectFloats;
    }

    public void setObjectFloats(Float[] objectFloats) {
        this.objectFloats = objectFloats;
    }

    public Double getaObjectDouble() {
        return aObjectDouble;
    }

    public void setaObjectDouble(Double aObjectDouble) {
        this.aObjectDouble = aObjectDouble;
    }

    public Double[] getObjectDoubles() {
        return objectDoubles;
    }

    public void setObjectDoubles(Double[] objectDoubles) {
        this.objectDoubles = objectDoubles;
    }

    public Byte getaObjectByte() {
        return aObjectByte;
    }

    public void setaObjectByte(Byte aObjectByte) {
        this.aObjectByte = aObjectByte;
    }

    public Byte[] getObjectBytes() {
        return objectBytes;
    }

    public void setObjectBytes(Byte[] objectBytes) {
        this.objectBytes = objectBytes;
    }

    public Boolean getaObjectBoolean() {
        return aObjectBoolean;
    }

    public void setaObjectBoolean(Boolean aObjectBoolean) {
        this.aObjectBoolean = aObjectBoolean;
    }

    public Boolean[] getObjectBooleans() {
        return objectBooleans;
    }

    public void setObjectBooleans(Boolean[] objectBooleans) {
        this.objectBooleans = objectBooleans;
    }

    public Character getaObjectChar() {
        return aObjectChar;
    }

    public void setaObjectChar(Character aObjectChar) {
        this.aObjectChar = aObjectChar;
    }

    public Character[] getObjectChars() {
        return objectChars;
    }

    public void setObjectChars(Character[] objectChars) {
        this.objectChars = objectChars;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String[] getStrings() {
        return strings;
    }

    public void setStrings(String[] strings) {
        this.strings = strings;
    }

    public Character[] getArrayCharacters() {
        return arrayCharacters;
    }

    public void setArrayCharacters(Character[] arrayCharacters) {
        this.arrayCharacters = arrayCharacters;
    }

    public BrandReq[] getArrayBrandReq() {
        return arrayBrandReq;
    }

    public void setArrayBrandReq(BrandReq[] arrayBrandReq) {
        this.arrayBrandReq = arrayBrandReq;
    }

    public Collection<Integer> getIntegerCollection() {
        return integerCollection;
    }

    public void setIntegerCollection(Collection<Integer> integerCollection) {
        this.integerCollection = integerCollection;
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public Set<Double> getDoubleSet() {
        return doubleSet;
    }

    public void setDoubleSet(Set<Double> doubleSet) {
        this.doubleSet = doubleSet;
    }

    public String[][] getArrayArrayString() {
        return arrayArrayString;
    }

    public void setArrayArrayString(String[][] arrayArrayString) {
        this.arrayArrayString = arrayArrayString;
    }

    public Collection<List<Short>> getListCollectionShort() {
        return listCollectionShort;
    }

    public void setListCollectionShort(Collection<List<Short>> listCollectionShort) {
        this.listCollectionShort = listCollectionShort;
    }

    public Collection<BrandReq> getCollectionBrandReq() {
        return collectionBrandReq;
    }

    public void setCollectionBrandReq(Collection<BrandReq> collectionBrandReq) {
        this.collectionBrandReq = collectionBrandReq;
    }

    public Collection<BrandReq[]> getCollectionArrayBrandReq() {
        return collectionArrayBrandReq;
    }

    public void setCollectionArrayBrandReq(Collection<BrandReq[]> collectionArrayBrandReq) {
        this.collectionArrayBrandReq = collectionArrayBrandReq;
    }

    public Collection<boolean[]> getCollectionBoolean() {
        return collectionBoolean;
    }

    public void setCollectionBoolean(Collection<boolean[]> collectionBoolean) {
        this.collectionBoolean = collectionBoolean;
    }

    public Collection<Collection<Float[]>> getCollectionCollectionArrayFloat() {
        return collectionCollectionArrayFloat;
    }

    public void setCollectionCollectionArrayFloat(Collection<Collection<Float[]>> collectionCollectionArrayFloat) {
        this.collectionCollectionArrayFloat = collectionCollectionArrayFloat;
    }

    public Collection<Set<List<Long[]>>> getCollectionSetListArrayLong() {
        return collectionSetListArrayLong;
    }

    public void setCollectionSetListArrayLong(Collection<Set<List<Long[]>>> collectionSetListArrayLong) {
        this.collectionSetListArrayLong = collectionSetListArrayLong;
    }

    public Collection<Integer[]>[] getArrayCollectionArrayInteger() {
        return arrayCollectionArrayInteger;
    }

    public void setArrayCollectionArrayInteger(Collection<Integer[]>[] arrayCollectionArrayInteger) {
        this.arrayCollectionArrayInteger = arrayCollectionArrayInteger;
    }

    public Collection<Integer>[] getArrayCollectionInteger() {
        return arrayCollectionInteger;
    }

    public void setArrayCollectionInteger(Collection<Integer>[] arrayCollectionInteger) {
        this.arrayCollectionInteger = arrayCollectionInteger;
    }

    public Map<String, Object> getObjectMap() {
        return objectMap;
    }

    public void setObjectMap(Map<String, Object> objectMap) {
        this.objectMap = objectMap;
    }

    public Set<List<Map<String, Object>>> getSetListMapObject() {
        return setListMapObject;
    }

    public void setSetListMapObject(Set<List<Map<String, Object>>> setListMapObject) {
        this.setListMapObject = setListMapObject;
    }
}