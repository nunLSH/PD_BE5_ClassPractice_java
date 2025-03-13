package com.grepp.library.c_collection.d_map.grepp;

import com.grepp.library.c_collection.c_set.grepp._HashSet_p2;
import java.util.Map.Entry;

public class _HashMap <K, V>{

    private final _EntrySet<_Entry<K, V>> entrySet = new _EntrySet<>();

    public V put(K key, V value){
        _Entry<K, V> entry = new _Entry<>(key, value);

        if(entrySet.add(entry)){
            return value;
        }

        return null;
    }

    public V get(K key){
        _Entry<K, V> entry = entrySet.get(new _Entry<>(key, null));
        if (entry == null) return null;
        return entry.getValue();
    }

    public V remove(K key){
        _Entry<K, V> entry = entrySet.get(new _Entry<>(key, null));
        if (entry == null) return null;

        V value = entry.getValue();
        entrySet.remove(entry);
        return value;
    }

    public _HashSet_p2<_Entry<K, V>> entrySet(){
        return entrySet;
    }

    public boolean containsKey(K key){
        return get(key) != null;
    }

    @Override
    public String toString() {
        return entrySet().toString();
    }
}
