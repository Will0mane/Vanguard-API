package me.will0mane.lang.vanguard.api.constructors;

import me.will0mane.lang.vanguard.api.fields.VGField;

import java.util.function.Consumer;

public interface VGConstructor {

    VGField<?>[] params();
    Consumer<VGField<?>[]> onConstruct();

}
