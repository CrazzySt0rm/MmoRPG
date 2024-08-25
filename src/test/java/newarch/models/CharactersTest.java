package newarch.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CharactersTest {



        @Test
        public void duelCharacters() {

            Characters knight = new Characters();

            Characters mage = new Characters();

            //List<Characters> expected = Characters.duelCharacters();

            Assertions.assertEquals(knight, mage);


        }

}