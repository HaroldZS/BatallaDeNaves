    import java.util.Scanner;
public class Principal
{
    private int corx; // Coordenada en x
    private char cory; // Coordenada en y
    private boolean ganar = false;
    
    public void prueba(){
        Casilla[][] mat = {
            {new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0)},
            {new Casilla('A',0),new Casilla('B',2),new Casilla('A',0),new Casilla('B',4),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0)},
            {new Casilla('A',0),new Casilla('B',2),new Casilla('A',0),new Casilla('B',4),new Casilla('A',0),new Casilla('B',5),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0)},
            {new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('B',4),new Casilla('A',0),new Casilla('B',5),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0)},
            {new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('B',4),new Casilla('A',0),new Casilla('B',5),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0)},
            {new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('B',5),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0)},
            {new Casilla('A',0),new Casilla('B',3),new Casilla('B',3),new Casilla('B',3),new Casilla('A',0),new Casilla('B',5),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0)},
            {new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0)},
            {new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0)},
            {new Casilla('A',0),new Casilla('A',0),new Casilla('B',3),new Casilla('B',3),new Casilla('B',3),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0)}
        };
        Casilla[][] oMat = {
            {new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0)},
            {new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0)},
            {new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0)},
            {new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0)},
            {new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0)},
            {new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0)},
            {new Casilla('A',0),new Casilla('B',2),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0)},
            {new Casilla('A',0),new Casilla('B',2),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0)},
            {new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0)},
            {new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0)}
        };
        
        Tablero radar1 = null;
        Tablero radar2 = null;
        
        //Scanner
        Scanner sc = new Scanner(System.in);
        
        //Crear tablero J1
        System.out.println("Tablero propio Jugador 1");
        Tablero t1 = new Tablero(mat);
        t1.mostrar();
        
        //Crear tablero J2
        System.out.println("Tablero propio Jugador 2");
        Tablero t2 = new Tablero(oMat);
        t2.mostrar();
        
        System.out.println("Empieza el Juego!");
        while(!ganar){
            System.out.println("===============Interfaz J1================");
            System.out.println("J1 Propio");
            t1.mostrar();
            System.out.println("J1 Radar");
            radar1 = new Tablero(genRadar(t2.getTab()));
            radar1.mostrar();
            
            pedirXY(sc);
                            
            //J1 ataca a J2
            t2.atacadoEn(corx,cory);
            
            System.out.println("===============Interfaz J1================");
            System.out.println("J1 Propio");
            t1.mostrar();
            System.out.println("J1 Radar");
            radar1 = new Tablero(genRadar(t2.getTab()));
            radar1.mostrar();
            
            System.out.println("===============Interfaz J2================");
            System.out.println("J2 Propio");
            t2.mostrar();
            System.out.println("J2 Radar");
            radar2 = new Tablero(genRadar(t1.getTab()));
            radar2.mostrar();
            
            pedirXY(sc);
        
            //J2 ataca a J1
            t1.atacadoEn(corx,cory);
            
            System.out.println("===============Interfaz J2================");
            System.out.println("J2 Propio");
            t2.mostrar();
            System.out.println("J2 Radar");
            radar2 = new Tablero(genRadar(t1.getTab()));
            radar2.mostrar();
        }
    }
    private void pedirXY(Scanner sc){
        System.out.println("Indique un número entre entre {1-10}");
        corx = sc.nextInt();
        System.out.println("Indique una letra entre {A-J}");
        cory = sc.next().charAt(0);
    }
    private Casilla[][] genRadar(Casilla[][] t){
        Casilla[][] c = {
            {new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0)},
            {new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0)},
            {new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0)},
            {new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0)},
            {new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0)},
            {new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0)},
            {new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0)},
            {new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0)},
            {new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0)},
            {new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0),new Casilla('A',0)}
        };
        for(int i=0; i< t.length; i++){
            for(int j=0; j< t[0].length; j++){
                if(t[i][j].getAtck()==false){
                    c[i][j] = new Casilla('A',t[i][j].getDim());
                }else{
                    if(t[i][j].getIden()=='A'){
                        c[i][j] = new Casilla('N',t[i][j].getDim());
                        c[i][j].setAtck();
                    }else{
                        c[i][j] = new Casilla('X',t[i][j].getDim());
                        c[i][j].setAtck();
                    }
                }
            }
        }
        return c;
    }
}