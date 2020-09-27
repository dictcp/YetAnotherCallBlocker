package dummydomain.yetanothercallblocker;

import android.content.Context;

import dummydomain.yetanothercallblocker.data.NumberInfo;
import dummydomain.yetanothercallblocker.data.SiaNumberCategoryUtils;
import dummydomain.yetanothercallblocker.sia.model.NumberCategory;

public class NumberInfoUtils {

    public static String getShortDescription(Context context, NumberInfo numberInfo) {
        if (numberInfo.communityDatabaseItem != null) {
            NumberCategory category = NumberCategory.getById(
                    numberInfo.communityDatabaseItem.getCategory());

            if (category != null && category != NumberCategory.NONE) {
                return SiaNumberCategoryUtils.getName(context, category);
            }
        }

        if (numberInfo.blacklistItem != null && numberInfo.contactItem == null) {
            return context.getString(R.string.info_in_blacklist);
        }

        return null;
    }

}
