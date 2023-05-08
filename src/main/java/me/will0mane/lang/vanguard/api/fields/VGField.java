package me.will0mane.lang.vanguard.api.fields;

import me.will0mane.lang.vanguard.api.attributes.VGAttribute;
import me.will0mane.lang.vanguard.api.fields.type.VGType;

public interface VGField<T extends VGType> {

    VGType type();
    String name();
    VGAttribute[] attributes();
    default T getDefault() {
        return null;
    }

}
