package com.fi.ls.rest.mixin;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Lukáš Daubner (410034)
 *
 */
@JsonIgnoreProperties({ "lecturer" })
public class LanguageDTOMixin {
    
}

