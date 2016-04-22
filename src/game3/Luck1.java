package game3;
import java.util.Scanner;
public class Luck1 {
 static Scanner input=new Scanner(System.in);
 static String engName1,pwd1;
 static String [] name=new String[10];             //数组name存放注册用户名
 static String [] mima=new String[10];             //数组mima存放用户密码
 static int kahao,m=0,n=0,biaohao=0,mi=0;
 public static void main(String[] args) {
  boolean flag=true;                               //定义了一个boolean类型的变量，并使初值为true
  while(flag){                                     //将flag用作循环的判断依据，默认循环
  System.out.println("*****欢迎进入奖客富翁系统**********");
  System.out.println("       1.注册");
  System.out.println("       2.登录");
  System.out.println("       3.抽奖");
  System.out.println("****************************");
  System.out.println("请选择菜单：");
  int user=0;
  user=input.nextInt();
 switch (user) {
        case 1:
         inputZhuce();                //实现注册的方法
     break;
        case 2:
     dengLu();                       //实现登录的方法
     break;
        case 3:
     chouJiang();                    //实现抽奖的方法
     break;
  default:
	  flag=false;                    //修改flag的值为false,使循环结束
   break;
  }
 }
 }
 public static void inputZhuce(){
  System.out.println("<奖客富翁系统>注册");
     System.out.println("请填写个人注册信息");
     System.out.println("用户名：");
     name[biaohao]=input.next();              //用字符串数组变量name来存储每个用户的账号
     System.out.println("密码：");
     mima[mi]=input.next();                  //用字符串数组变量mima来存储每个用户的密码
     System.out.println("注册成功！请记住您的信息。");
     int kahao=(int)(Math.random()*10);      //随机生成当前用户的幸运数字kahao存储
     System.out.println("用户名\t"+"密码\t"+"会员卡号");
     System.out.println(name[biaohao]+"\t"+mima[mi]+"\t"+kahao);
     biaohao++;
     mi++;
     m=1;                                    //赋值为1用于判断用户是否注册
     
 }
 
 public static void dengLu(){
  if (m==1) {
   biaohao=0;
   mi=0;
   for (int i = 0; i <3; i++) {
    System.out.println("用户名：");
    engName1=input.next();
    System.out.println("密码：");
    pwd1=input.next();
    for (int j = 0; j < mima.length; j++) {
    if (engName1.equals(name[biaohao])&&pwd1.equals(mima[mi]))//判断当前输入用户和密码与字符串数组name和mima是否一样
    {
     System.out.println("恭喜您，登录成功！");
     n=1;                              //赋值为1用于判断用户是否登录
     return;
    }
    biaohao++;
    mi++;
   } 
    System.out.println("用户名和密码有误！你还有"+(2-i)+"次机会，请重新输入！");
   }
  }
  else
   System.out.println("您还没有注册！");
  }
 public static void chouJiang(){
  if (n==1) {
  int []lnumber=new int[5];
  for (int i = 0; i < lnumber.length; i++) {
   lnumber[i]=(int)(Math.random()*10);
   System.out.println(lnumber[i]);
  }
      System.out.println("请输入您的卡号：");
      kahao=input.nextInt();
     for (int j = 0; j < lnumber.length; j++) {
      if (lnumber[j]==kahao) {
      System.out.println("恭喜您，中奖啦！"); 
      return ;
       } 
      }
      System.out.println("抱歉，您没中奖！"); 
  }
     else System.out.println("您还没有登录！");
 }
}
