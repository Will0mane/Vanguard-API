package me.will0mane.lang.vanguard.api.module;

import me.will0mane.lang.vanguard.api.constructors.VGConstructor;
import me.will0mane.lang.vanguard.api.fields.VGField;
import me.will0mane.lang.vanguard.api.methods.VGMethod;

public interface VGModule {

    String name();
    String path();
    VGField<?>[] moduleFields();
    VGConstructor[] constructors();
    VGMethod[] methods();

}
