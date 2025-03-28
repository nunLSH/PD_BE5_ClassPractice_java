package com.grepp.greppcat.util;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MultiValueMap<K, V> {

    protected final Map<K, List<V>> data = new LinkedHashMap<>();

    public MultiValueMap<K, V> add(K key, V value){

        List<V> values = data.get(key);
        if(values == null){
            values = new ArrayList<>();
            values.add(value);
            data.put(key, values);
            return this;
        }

        values.add(value);
        return this;
    }

    public List<V> get(K key){
        return data.get(key);
    }
    public Set<Entry<K, List<V>>> entrySet(){
        return data.entrySet();
    }

    @Override
    public String toString() {
        return "MultiValueMap{" +
            "data=" + data +
            '}';
    }
}