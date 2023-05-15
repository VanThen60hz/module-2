package Phone.service;

import java.io.IOException;

public interface PhoneService {
    void add() throws IOException;
    void delete() throws IOException;
    void edit()throws IOException;
    void display() throws IOException;
}
