package nl.han.aim.oose.dea;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterList {

    List<String> filterStringsShorterThanThreeCharacters(List<String> input) {
        // TODO: implement
        int maxCharacter = 3;
        return input.stream().filter(string -> string.length() <= maxCharacter).collect(Collectors.toList());
    }

    List<String> filterStringsThatContainOnlyNumerals(List<String> input) {
        // TODO: implement

        String regex = "[0-9]+";

        return input.stream().filter(number -> number.matches(regex)).collect(Collectors.toList());
    }
}
