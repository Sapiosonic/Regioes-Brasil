public class Regioes {
    public static void main(String[] args) throws Exception {
        String[] n =  {"AC", "AM", "AP", "PA","RO","RR","TO"};
        String[] ne = {"AL", "BA", "CE", "MA", "PI","PE", "PB","RN","SE"};
        String[] co = {"GO","MT","MS","DF"};
        String[] se = {"ES", "MG","RJ", "SP"};
        String[] s =  {"PR", "RS","SC"};

        System.out.println("## NORTE ##");
        for(int i =0; i < n.length; i++){
            System.out.println(n[i]);
        }
    
        System.out.println();
        System.out.println("## NORDESTE ##");
        for(int i =0; i <ne.length; i++){
            System.out.println(ne[i]);
        }
    
        System.out.println();
        System.out.println("## CENTRO-OESTE ##");
        for(int i =0; i <co.length; i++){
            System.out.println(co[i]);
        }

        System.out.println();
        System.out.println("## SUDESTE ##");
        for(int i =0; i <se.length; i++){
            System.out.println(se[i]);
        }

        System.out.println();
        System.out.println("## SUL ##");
        for(int i =0; i <s.length; i++){
            System.out.println(s[i]);
        }
    }
}
