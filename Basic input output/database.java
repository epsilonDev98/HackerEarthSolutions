/*
https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/database-0c7cce47/
*/



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
 
class TestClass {
    
    private static String display(int[] cname)
    {
        StringBuilder sb = new StringBuilder();
        sb.append("+");
        for(int length: cname)
        {
            while(length-->0)
              sb.append("-");
            sb.append("+");  
        }
        return sb.toString();
    }
    
    private static void printColumnName(StringBuilder sb, String[] columnName, int[] cname)
    {
        sb.append("|");
        for(int i=0;i<columnName.length;i++)
        {
          left(sb, columnName[i], cname[i]);
          sb.append("|");
        }
        sb.append("\n");
    }
    
    private static void left(StringBuilder sb, String name, int length)
    {
        sb.append(" "+ name);
        length -= (name.length()+1);
        while(length-->0)
          sb.append(" ");
    }
    
    private static void right(StringBuilder sb, String name, int length)
    {
        length -= (name.length()+1);
        while(length-->0)
          sb.append(" ");
        sb.append(name+" ");  
    }
    
    private static void printRecord(StringBuilder sb, String[][] fieldsName, int[] cname, boolean[] right)
    {
 
        for( String[] fieldName: fieldsName)
        {
            sb.append("|");            
            for( int i=0;i<fieldName.length;i++)
            {
                if(!(right[i]))
                  left(sb, fieldName[i], cname[i]);
                else
                  right(sb,fieldName[i], cname[i]);
                sb.append("|");  
            }
            sb.append("\n");
        }
    }
    
    
    
    public static void main(String args[] ) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int numberOfTable = Integer.parseInt(br.readLine());
       StringTokenizer token, token_1, token_2;
       while(numberOfTable-->0)
       {
           StringTokenizer st = new StringTokenizer(br.readLine());
           int noc = Integer.parseInt(st.nextToken());
           int nor = Integer.parseInt(st.nextToken());
           
           String columnName[] = new String[noc];
           int cname[] = new int[noc];
           token = new StringTokenizer(br.readLine());
           for(int i =0;i<noc;i++)
           {
               String temp = token.nextToken();
               columnName[i] = temp;
               cname[i] = temp.length();
           }
           
           String fieldsName[][] = new String[nor][noc];
           boolean right[] = new boolean[noc];
           token_1 = new StringTokenizer(br.readLine());
           for(int i=0;i<noc;i++)
           {
               String temp = token_1.nextToken();
               fieldsName[0][i] = temp;
               cname[i] = Math.max(temp.length(), cname[i]);
               if(Character.isDigit(temp.charAt(0)) && !temp.contains("/"))
               {
                   right[i] = true;
               }
           }
           
           for(int i=1;i<nor;i++)
           {
              token_2 = new StringTokenizer(br.readLine());
              for(int j=0;j<noc;j++)
              {
                  String temp = token_2.nextToken(); 
                  fieldsName[i][j] = temp;
                  cname[j] = Math.max(temp.length(), cname[j]);
              }
           }
           
           for(int i=0;i<noc;i++)
              cname[i] +=2;
              
           StringBuilder sb = new StringBuilder();
           String buildDelim = display(cname);
           sb.append(buildDelim+"\n");
           printColumnName(sb,columnName,cname);
           //sb.append("\n");
           sb.append(buildDelim+"\n");
           
           printRecord(sb,fieldsName,cname,right);
           sb.append(buildDelim+"\n");
           System.out.println(sb);
       }
 
    }
}
