// AbbreviateTwoWords.java
public final class AbbreviateTwoWords {

    private AbbreviateTwoWords() {
        throw new UnsupportedOperationException("Utility class should not be instantiated.");
    }

    /**
     * Abbreviates a name by taking the first letter of each word and separating them with a dot.
     *
     * @param name The full name.
     * @return The abbreviated name.
     */
    public static String abbrevName(final String name) {
        final String[] names = name.toUpperCase().split(" ");
        if (names.length < 2) {
            throw new IllegalArgumentException(
                "The name must consist of at least two words.");
        }
        return names[0].charAt(0) + "." + names[1].charAt(0);
    }
}
