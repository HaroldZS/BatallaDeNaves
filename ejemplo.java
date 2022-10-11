public class ejemplo
{
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
        
        Tablero radar1;
        Tablero radar2;
        
        //Crear tablero J1
        Tablero t1 = new Tablero(mat);
        t1.mostrar();
        //Crear tablero J2
        Tablero t2 = new Tablero(oMat);
        t2.mostrar();
        
        //J1 ataca a J2
        System.out.println("Jugador 1 ataca a Jugador 2");
        t2.atacadoEn(0,9);
        t2.mostrar();
        
        radar1 = t2;
        radar1.radar();
        System.out.println("Radar Jugador 1");
        radar1.mostrar();
    }
}