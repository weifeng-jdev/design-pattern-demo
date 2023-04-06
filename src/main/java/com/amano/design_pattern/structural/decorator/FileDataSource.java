package com.amano.design_pattern.structural.decorator;

import lombok.AllArgsConstructor;

import java.io.*;

/**
 * @className: FileDataSource
 * @package com.amano.design_pattern.structural.decorator
 * @description: TODO 类描述
 * @author: weifeng
 * @date: 2023/4/6
 **/
@AllArgsConstructor
public class FileDataSource implements Decorator{
    String name;

    @Override
    public void writeData(String data) {
        File file = new File(name);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try(FileWriter fis = new FileWriter(file)) {
            fis.write(data);
            fis.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String readData() {
        File file = new File(name);
        if (!file.exists()) {
            return null;
        }
        try (FileReader fr = new FileReader(file)){
            char[] chars = new char[1024 * 1024];
            fr.read(chars);
            return chars.toString();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
