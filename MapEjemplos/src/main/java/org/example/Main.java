package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
  /*      Map<String, String> objMap = new HashMap<>();
        objMap.put("Nombre", "Suzuki");
        objMap.put("Potencia", "220");
        objMap.put("Tipo", "2-wheeler");
        objMap.put("Precio", "85000");
        System.out.println("Elementos del mapa:");
        System.out.println(objMap);
        System.out.println(objMap.size());
        System.out.println(objMap.get("Nombre"));
        System.out.println("-------------TreeMap (ordena el HashMap por clave---------------");
        Map<String, String> objOMap = new TreeMap<>(objMap);
        System.out.println(objOMap);
        Map<String, String> objOMap2 = new TreeMap<>(new porLongitudAlfabeticoReves());
        objOMap2.putAll(objMap);
        System.out.println(objOMap2);
        Iterator<String> it= objOMap2.keySet().iterator();
        while(it.hasNext()){
            String aux = it.next();
            System.out.print(aux+"-");
            System.out.println(objOMap2.get(aux));
        }
*/
        //otro ejemplo
        HashMap<String, Integer> prices = new HashMap<>();
        prices.put("Mustang", 10000);
        prices.put("Megane", 55000);
        prices.put("Toledo", 44300);
        prices.put("I30", 53200);
        prices.put("A6", 60200);
        // print map details
        System.out.println("Car prices before update: " + prices.toString());

        prices.computeIfAbsent("A6", k -> 2000 + 33000);
        //if !contains-> put
        prices.computeIfAbsent("A5", k -> 2000 * 34);
        System.out.println("Car prices after update " + prices);

        List<Integer> lista = List.of(1,2,3);
        Set<Integer> listaSet = Set.of(2,5,10);

        System.out.println(lista);
        System.out.println(listaSet);


        Map<String,List<Integer>> mapaCochePrecios = new HashMap<>();
        mapaCochePrecios.put("mini", List.of(5000,4000,3000));
        mapaCochePrecios.put("mercedes", List.of(200000,30000,50000));
        //mapaCochePrecios.get("mini").add(8000); //no se puede añadir, con List.of se crean listas inmutables
        mapaCochePrecios.forEach((k, v) -> {
            System.out.println(k+ "  "+ v);
        });

        Map<Integer,String> mapa = new HashMap<>();
        for(int i=100;i>0;i--){
            mapa.put(i,"lenguaje"+i);
        }

        mapa.put(3, "PHP");
        mapa.put(4, "Java");
        mapa.put(5, "C");
        mapa.put(1, "SQL");
        mapa.put(2, "Python");

        System.out.println("Tutorial en Guru99:" + mapa);

        // Eliminar el valor de la clave 5
        mapa.remove(3);
        mapa.compute(5,(k,v)->v.concat("++"));
        mapa.put(5,mapa.get(5)+"++");

        System.out.println("Tutorial en Guru99 después de eliminar el 3 y actualizar el 5:" + mapa);


        Set<Integer> listaClaves = mapa.keySet();
        //1. Clásica
        Iterator<Integer> it = listaClaves.iterator();
        while(it.hasNext()){
            Integer aux = it.next();
            System.out.println("Clave:"+ aux + "="+ " Valor: "+ mapa.get(aux));
        }

        //2. Foreach
        for (Integer elemento : listaClaves) {
            System.out.println("Clave:"+ elemento + "="+ " Valor: "+ mapa.get(elemento));
        }
        //3. Lambda y programación funcional
        mapa.keySet().forEach(aux ->System.out.println("Clave:"+ aux + "="+ " Valor: "+ mapa.get(aux)));

        mapa.keySet().forEach(clave-> System.out.println("Clave"+ clave));

        System.out.println("--------------Otra forma-----------------");
        //streams y lambda

        mapa.keySet().stream().forEach(c-> System.out.println("Clave:"+ c + "="+ " Valor: "+ mapa.get(c)));
        System.out.println("---------------Sólo muestra aquellas claves que cumplen un filtrado-----------------");
        mapa.keySet().stream().filter(k->k.intValue()>=20 && k.intValue()<=30).forEach(System.out::println);
        System.out.println("--------------Listando solo valores-------------------");
        mapa.values().stream().filter(s->s.contains("9")).forEach(System.out::println);
        System.out.println("--------------Listando solo los valores que cumplen una condición-------------------");
        mapa.values().stream().filter(c->c.contains("1")).forEach(c-> System.out.println("asdf"+c));

    }
}