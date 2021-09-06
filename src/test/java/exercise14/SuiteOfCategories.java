package exercise14;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import categories.Positives;

@RunWith(Categories.class)
@IncludeCategory(Positives.class)
@SuiteClasses({ TestCategorized.class })
public class SuiteOfCategories {

}
