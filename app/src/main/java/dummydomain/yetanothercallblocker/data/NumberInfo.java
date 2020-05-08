package dummydomain.yetanothercallblocker.data;

import dummydomain.yetanothercallblocker.sia.model.database.CommunityDatabaseItem;
import dummydomain.yetanothercallblocker.sia.model.database.FeaturedDatabaseItem;

public class NumberInfo {

    public enum Rating {
        POSITIVE, NEUTRAL, NEGATIVE, UNKNOWN
    }

    // id
    public String number;

    // info from various sources
    public CommunityDatabaseItem communityDatabaseItem;
    public FeaturedDatabaseItem featuredDatabaseItem;
    public ContactItem contactItem;

    // computed rating
    public Rating rating = Rating.UNKNOWN;

    // name (for convenience)
    public String name;

}