package net.villim.villim;

/**
 * Created by seongmin on 6/10/17.
 */

public class VillimKeys {

    /* Server constants */
//    public static final String SERVER_SCHEME = "http";
//    public static final String SERVER_HOST = "175.207.29.19";
    public static final String SERVER_SCHEME = "http";
    public static final String SERVER_HOST = "www.mocky.io";

    /* URLS */
    public static final String LOGIN_URL = "http://175.207.29.19/a/login";
    public static final String SIGNUP_URL = "http://175.207.29.19/a/signup";
    public static final String CHANGE_PASSCODE_URL = "http://www.mocky.io/v2/594478881200005716fcb615";
    public static final String MY_HOUSE_URL = "v2/594470cc120000a015fcb60f";
    public static final String OPEN_DOORLOCK_URL = "v2/5944895a120000f117fcb61b";
    public static final String RESERVE_URL = "http://www.mocky.io/v2/5942f90b120000ff12ddc665";
    public static final String FEATURED_HOUSES_URL = "v2/5944039a120000380bfcb53f";
    public static final String HOST_INFO_URL = "v2/594175a00f0000770ec63237";
    public static final String HOUSE_INFO_URL = "v2/59441d55120000930dfcb57e";
    public static final String HOUSE_REVIEW_URL = "v2/5941d5200f00002e16c632c4";
    public static final String VISIT_INFO_URL = "v2/59442d6c1200002f0ffcb5a5";
    public static final String POST_REVIEW_URL = "v2/59454496130000800b5b6f82";
    public static final String FIND_PASSWORD_URL = "v2/59454496130000800b5b6f82";

    /* Request success codes */
    public static final String KEY_QUERY_SUCCESS = "query_success";

    /* Activity request codes */


    /* Intent data keys */
    public static final String KEY_USER = "user";

    /* My Key Activity */
    public static final String KEY_RESERVATION_ACTIVE = "reservation_active";

    /* User info */
    public static final String KEY_LOGIN_SUCCESS = "login_success";
    public static final String KEY_USER_INFO = "user_info";
    public static final String KEY_ID = "id";
    public static final String KEY_FULLNAME = "fullname";
    public static final String KEY_EMAIL = "email";
    public static final String KEY_PASSWORD = "password";
    public static final String KEY_PROFILE_PIC_URL = "profile_pic_url";
    public static final String KEY_ABOUT = "about";
    public static final String KEY_USER_STATUS = "user_status";
    public static final String KEY_ROOM_ID = "room_id";

    /* Login Keys */
    public static final String KEY_MESSAGE = "message";

    /* Signup Keys */
    public static final String KEY_SIGNUP_SUCCESS = "signup_success";
    public static final String KEY_FIRSTNAME = "firstname";
    public static final String KEY_LASTNAME = "lastname";

    /* House Info */
    public static final String KEY_HOUSE_INFO = "house_info";
    public static final String KEY_HOUSE_ID = "house_id";
    public static final String KEY_HOUSE_NAME = "house_name";
    public static final String KEY_ADDR_FULL = "addr_full";
    public static final String KEY_ADDR_SUMMARY = "addr_summary";
    public static final String KEY_ADDR_DIRECTION = "addr_direction";
    public static final String KEY_DESCRIPTION = "description";
    public static final String KEY_NUM_GUEST = "num_guest";
    public static final String KEY_NUM_BEDROOM = "num_bedroom";
    public static final String KEY_NUM_BED = "num_bed";
    public static final String KEY_NUM_BATHROOM = "num_bathroom";

    public static final String KEY_RATE_PER_NIGHT = "rate_per_night";
    public static final String KEY_DEPOSIT = "deposit";
    public static final String KEY_ADDITIONAL_GUEST_FEE = "additional_guest_fee";
    public static final String KEY_CLEANING_FEE = "cleaning_fee";

    public static final String KEY_LOCK_ADDR = "lock_addr";
    public static final String KEY_LOCK_PC = "lock_pw";
    public static final String KEY_HIT = "hit";
    public static final String KEY_LATITUDE = "latitude";
    public static final String KEY_LONGITUDE = "longitude";
    public static final String KEY_STATUS = "status";
    public static final String KEY_CREATED = "created";
    public static final String KEY_MODIFIED = "modified";
    public static final String KEY_HOUSE_POLICY = "house_policy";
    public static final String KEY_CANCELLATION_POLICY = "refund_policy";

    public static final String KEY_HOST_ID = "host_id";
    public static final String KEY_HOST_NAME = "host_name";
    public static final String KEY_HOST_RATING = "host_rating";
    public static final String KEY_HOST_REVIEW_COUNT = "host_review_count";
    public static final String KEY_HOST_PROFILE_PIC_URL = "host_profile_pic_url";
    public static final String KEY_HOUSE_RATING = "house_rating";
    public static final String KEY_HOUSE_REVIEW_COUNT = "house_review_count";
    public static final String KEY_HOUSE_THUMBNAIL_URL = "house_thumbnail_url";
    public static final String KEY_AMENITY_IDS = "amenity_ids";
    public static final String KEY_HOUSE_PIC_URLS = "house_pic_urls";

    public static final String KEY_REVIEW_LAST_CONTENT = "review_last_content";
    public static final String KEY_REVIEW_LAST_REVIEWER = "review_last_reviewer";
    public static final String KEY_REVIEW_LAST_RATING = "review_last_rating";
    public static final String KEY_REVIEW_LAST_PROFILE_PIC_URL = "review_last_profile_pic_url";

    /* Review info keys */
    public static final String KEY_REVIEWS = "reviews";
    public static final String KEY_REVIEW_COUNT = "review_count";
    public static final String KEY_REVIEWER_ID = "reviewer_id";
    public static final String KEY_RESERVATION_ID = "reservation_id";
    public static final String KEY_REVIEWER_NAME = "reviewer_name";
    public static final String KEY_REVIEW_CONTENT = "review_content";
    public static final String KEY_REVIEWER_PROFILE_PIC_URL = "reviewer_profile_pic_url";
    public static final String KEY_REVIEW_DATE = "review_date";
    public static final String KEY_RATING_OVERALL = "rating_overall";
    public static final String KEY_RATING_ACCURACY = "rating_accuracy";
    public static final String KEY_RATING_COMMUNICATION = "rating_communication";
    public static final String KEY_RATING_CLEANLINESS = "rating_cleanliness";
    public static final String KEY_RATING_LOCATION = "rating_location";
    public static final String KEY_RATING_CHECKIN = "rating_checkin";
    public static final String KEY_RATING_VALUE = "rating_value";

    /* Reservation keys */
    public static final String KEY_RESERVATION_SUCCESS = "reservation_success";
    public static final String KEY_RESERVATION_INFO = "reservation_info";
    public static final String KEY_GUEST_ID = "guest_id";
    public static final String KEY_START_DATE = "start_date";
    public static final String KEY_END_DATE = "end_date";
    public static final String KEY_RESERVATION_TIME = "reservation_time";
    public static final String KEY_RESERVATION_STATUS = "reservation_status";
    public static final String KEY_RESERVATION_CODE = "reservation_code";

    /* Featured list */
    public static final String KEY_HOUSES = "houses";

    /* Visit list */
    public static final String KEY_VISITS = "visits";
    public static final String KEY_VISIT_ID = "visit_id";
    public static final String KEY_VISITOR_ID = "visitor_id";
    public static final String KEY_VISIT_TIME = "visit_time";
    public static final String KEY_VISIT_INFO = "visit_info";

    /* DoorlockPAsscodeActivity */
    public static final String KEY_CHANGE_SUCCESS = "change_success";
    public static final String KEY_PASSCODE = "passcode";
    public static final String KEY_PASSCODE_CONFIRM = "passcode_confirm";

    /* Doorlock Open */
    public static final String KEY_OPEN_AUTHORIZED = "open_authorized";
    public static final String KEY_OPEN_SUCESS = "open_success";

    /* Review Activity */
    public static final String KEY_POST_SUCCESS = "post_success";

}






