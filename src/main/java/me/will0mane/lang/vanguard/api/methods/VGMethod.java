package me.will0mane.lang.vanguard.api.methods;

import me.will0mane.lang.vanguard.api.attributes.VGAttribute;
import me.will0mane.lang.vanguard.api.fields.VGField;
import me.will0mane.lang.vanguard.api.fields.type.VGType;

import java.util.function.Consumer;

public interface VGMethod {

    VGAttribute[] attributes();
    String name();

    Class<? extends VGField<?>>[] params();
    Consumer<VGField<?>[]> onCall();
    default VGType returnType() {
        return null;
    }

}
