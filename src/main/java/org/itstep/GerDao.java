package org.itstep;

public interface GerDao <T,ID>{
    ID save(T data);
}
