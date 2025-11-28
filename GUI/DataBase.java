package storage;

import model.Cliente;
import model.Vuelo;
import model.Pasaje;
import model.Encomienda;

import java.util.ArrayList;

public class Database {
    public static ArrayList<Cliente> clientes = new ArrayList<>();
    public static ArrayList<Vuelo> vuelos = new ArrayList<>();
    public static ArrayList<Pasaje> pasajes = new ArrayList<>();
    public static ArrayList<Encomienda> encomiendas = new ArrayList<>();
}