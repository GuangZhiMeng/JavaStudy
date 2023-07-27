package chapterUp;

public class LingXing {
    public static void main(String[] args) {
        //上半部分：正的等腰三角形
        //5行
        for(int i=1; i<=5; i++){
            //(1)打印空格
			/*
			当i=1,打印4个空格，j=4,3,2,1	j>=i
			当i=2,打印3个空格，j=4,3,2
			当i=3,打印2个空格，j=4,3
			当i=4,打印1个空格，j=4
			当i=5,打印0个空格，j=4,让循环条件一次都不满足
			*/
            for(int j=4; j>=i; j--){
                System.out.print("  ");
            }
            //(2)打印*
			/*
			当i=1,打印1个,j=1					j<=2*i-1
			当i=2,打印3个,j=1,2,3,
			当i=3,打印5个,j=1,2,3,4,5
			当i=4,打印7个,j=1,2,3,4,5,6,7
			当i=5,打印9个,j=1,2,3,4,5,6,7,8,9
			*/
            for(int j=1; j<=2*i-1; j++){
                System.out.print("* ");
            }
            //(3)换行
            System.out.println();
        }


        //下半部分：倒立的等腰三角形
        //4行
        for(int i=1; i<=4; i++){
            //(1)打印空格
			/*
			当i=1,1个空格,j=1		j<=i
			当i=2,2个空格,j=1,2
			当i=3,3个空格,j=1,2,3
			当i=4,4个空格,j=1,2,3,4
			*/
            for(int j=1; j<=i; j++){
                System.out.print("  ");
            }
            //(2)打印*
			/*
			当i=1,7个*，j=1,2,3,4,5,6,7  j<=9-2*i;
			当i=2,5个*，j=1,2,3,4,5
			当i=3,3个*，j=1,2,3
			当i=4,1个*，j=1
			*/
            for(int j=1; j<=9-2*i; j++){
                System.out.print("* ");
            }
            //(3)换行
            System.out.println();
        }
    }
}
