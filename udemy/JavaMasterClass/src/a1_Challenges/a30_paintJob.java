package a1_Challenges;

public class a30_paintJob {

    public static void main(String[] args) {
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
    }

    public static int getBucketCount(double width,double height,double areaPerBucket,int extraBuckets){
        if(width<=0||height<=0||areaPerBucket<=0||extraBuckets<0) return -1;
        return (int)Math.ceil((height*width)/areaPerBucket)-extraBuckets;
    }
    public static int getBucketCount(double width,double height,double areaPerBucket){
        if(width<=0||height<=0||areaPerBucket<=0) return -1;
        return (int)Math.ceil((height*width)/areaPerBucket);
    }
    public static int getBucketCount(double area,double areaPerBucket){
        if(area<=0||areaPerBucket<=0) return -1;
        return (int)Math.ceil(area/areaPerBucket);
    }
}
