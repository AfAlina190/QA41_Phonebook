package com.phonebook.utils;

import com.phonebook.models.Contact;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviders {
    @DataProvider
    public Iterator<Object[]> addNewContactFromCsv() throws IOException {
        List<Object[]> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/сontact.csv")));

        String line = reader.readLine();

        while (line !=null) {

            String[] split = line.split(",");

            list.add(new Object[]{new Contact().setName(split[0]).setLastName(split[1])
                    .setPhone(split[2]).setEmail(split[3]).setAddress(split[4]).setDescription(split[5])});
            line = reader.readLine();

        }
        return list.iterator();
    }


    @DataProvider
    public Iterator<Object[]> addNewContact(){
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{"Lisa1","Ali","12245566900","als@gm.com","Koln","nurse"});
        list.add(new Object[]{"Lisa2","Ali","12245456900","als1@gm.com","Koln","nurse"});
        list.add(new Object[]{"Lisa3","Ali","12245578600","als2@gm.com","Koln","nurse"});

        return list.iterator();
    }

}
