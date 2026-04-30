import java.util.HashSet;

class findCommonStringFromTwoArrays {
    public static void main(String[] args) {
        String[] ar1={"arashad","jya","khan","pathan"};
        String[] ar2={"arashad","duf","elith","khan","khan"};
        HashSet<String> hs=new HashSet<>();
        HashSet<String> hs1=new HashSet<>();
        System.out.print("Common words are ");
        for (int i=0;i<ar1.length;++i){
            hs.add(ar1[i]);
        }
        //isme sabse pahle first wale array ke integer ko hs ke andar store kar denge jo double element hoga wo ek hi bar add hoga kyuki ye .add
        //function ki properties hoti hai
        for (int j=0;j<ar2.length;++j){
            boolean b=hs.add(ar2[j]);
            //aur uske baad  second for loop ke integer ko bhi hs ke andar add kar denge aur uske data type boolean kar denge isse kya hoga jo
            //element pahle se hi ar1 ka hs ke andar store hoga wo same element ar2 ka hs ke andar store nhi hoga aur store nhi hoga to type false
            //hoga
            if (b==false){
                hs1.add(ar2[j]);
                //jis condition par ye false hoga usko ek second HashTable hs2 ke andar store kar denege aur usko for Each loop ke help se print kra denge
                //ham yha par chahate to add nhi karate direct yhi print kra deyte but usse ar2 ke andar same element do bar hota do wah do bar print
                //kar deta isliye ham usko pahle dusre HashTable me add karaye hai isse jo double element hoga wah ek hi bar add hoga
            }
        }
        for (String word:hs1){
            System.out.print(word+" ");
        }
    }
}

