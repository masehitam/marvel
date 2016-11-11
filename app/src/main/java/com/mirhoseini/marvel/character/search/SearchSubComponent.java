package com.mirhoseini.marvel.character.search;

import dagger.Subcomponent;

/**
 * Created by Mohsen on 20/10/2016.
 */

@Search
@Subcomponent(modules = {
        AppSearchModule.class
})
public interface SearchSubComponent {

    void inject(CharacterSearchFragment fragment);

}