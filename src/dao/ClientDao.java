package dao;

import domain.Client;

public interface ClientDao {


    boolean saveClient(Client client);
    boolean deleteClient(Client client);
    void editClient();

    void RemoveClient();
}
