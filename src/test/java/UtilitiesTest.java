import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class UtilitiesTest {

    @Test
    public void transformShouldConvertCollectionElementsToUpperCase() {
        List<String> collection = asList("My", "name", "is", "John","Doe");
        List<String> expected = asList("MY","NAME","IS","JOHN","DOE");

        assertThat(Utilities.toUpperCaseList(collection)).hasSameElementsAs(expected);
    }

    @Test
    public void testTransformShouldFilterCollection() throws Exception {
        List<String> collection = asList("Wordy", "wrd", "length", "bat","Joe");
        List<String> expected = asList("wrd","bat","Joe");

        assertThat(Utilities.filterOutWordsGreaterThan4Chars(collection)).hasSameElementsAs(expected);
    }

    @Test
    public void testFlattenCollection() {
        List<List<String>> collection = asList(asList("Viktor", "Farcic"),
                                        asList("John", "Doe", "Third"));
        List<String> expected = asList("Viktor", "Farcic", "John", "Doe", "Third");
        assertThat(Utilities.flatten(collection)).hasSameElementsAs(expected);
    }

    @Test
    public void testSumElementsInList() {
        List<Integer> numbers = asList(1, 2, 3, 4, 5);
        assertThat(Utilities.sumList(numbers)).isEqualTo(1 + 2 + 3 + 4 + 5);
    }

//    @Test
//    17
//    public void transformShouldConvertCollectionElementsToUpperCase() {
//        18
//        List<Integer> numbers = asList(1, 2, 3, 4, 5);
//        19
//        assertThat(calculate(numbers)).isEqualTo(1 + 2 + 3 + 4 + 5);
//        20
//    }
//
//    6
//    @Test
//    17
//    public void getKidNameShouldReturnNamesOfAllKidsFromNorway() {
//        18
//        Person sara = new Person("Sara", 4);
//        19
//        Person viktor = new Person("Viktor", 40);
//        20
//        Person eva = new Person("Eva", 42);
//        21
//        Person anna = new Person("Anna", 5);
//        22
//        List<Person> collection = asList(sara, eva, viktor, anna);
//        23
//        assertThat(getKidNames(collection))
//        24
//                .contains("Sara", "Anna")
//        25
//                .doesNotContain("Viktor", "Eva");
//        26
//    }





}