package cl.praxis.model;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String > marcas = new ArrayList<>();

        marcas.add("marca01");
        marcas.add("marca02");
        marcas.add("marca03");
        marcas.add("marca04");
        marcas.add("marca05");
        marcas.add("marca06");
        marcas.add("marca07");
        marcas.add("marca08");
        marcas.add("marca09");
        marcas.add("marca10");

        for (String marca: marcas){
            System.out.println(marca);
        }

        marcas.add("Blockbaster");
        marcas.add("Carrefour");
        marcas.add("Jetix");

        for (String marca: marcas){
            System.out.println(marca);
        }

        marcas.set(10,"Blockbuster");

        for (String marca: marcas){
            System.out.println(marca);
        }

        marcas.remove(11);
        marcas.remove("Carrefour");
        for (String marca: marcas){
            System.out.println(marca);
        }

        ArrayList<String> posiblesMarcas = new ArrayList<>();
        posiblesMarcas.add("PosibleMarca01");
        posiblesMarcas.add("PosibleMarca02");
        posiblesMarcas.add("PosibleMarca03");
        posiblesMarcas.add("PosibleMarca04");
        posiblesMarcas.add("PosibleMarca05");

        marcas.addAll(posiblesMarcas);

        for (String marca: marcas){
            System.out.println(marca);
        }

        System.out.println(marcas.size());

        Set<String> invitados= new  TreeSet<>();

        invitados.add("Paola");
        invitados.add("Facundo");
        invitados.add("Pedro");
        invitados.add("Jacinta");
        invitados.add("Florencia");
        invitados.add("Juan Pablo");

        for (String invitado: invitados){
            System.out.println(invitado);
        }

        Set<String> posiblesInvitados= new  TreeSet<>();
        posiblesInvitados.add("Jorge");
        posiblesInvitados.add("Francisco");
        posiblesInvitados.add("Marcos");

        invitados.addAll(posiblesInvitados);

        for (String invitado: invitados){
            System.out.println(invitado);
        }
        invitados.remove("Jorge");

        for (String invitado: invitados){
            System.out.println(invitado);
        }

        Map<String,Integer> golosinas= new TreeMap<>();

        golosinas.put("Chocman",100);
        golosinas.put("Trululu",100);
        golosinas.put("Centella",100);
        golosinas.put("Kilate",50);
        golosinas.put("Miti-miti",30);
        golosinas.put("Traga Traga",150);
        golosinas.put("Tableton",5);

        for (Map.Entry<String,Integer> entry: golosinas.entrySet()){

            if(entry.getValue()<100){
            String key= entry.getKey();
            Integer value= entry.getValue();
                System.out.println(key);
                System.out.println(value);

            }
        }

        Queue<String> juegos = new LinkedList<>();

        juegos.add("Tombo");
        juegos.add("Congelado");
        juegos.add("Quemaditas");
        juegos.add("Cachipun");
        juegos.add("Pillarse");

        for (String juego: juegos){
            System.out.println(juego);
        }
        System.out.println(juegos.size());
    }
}