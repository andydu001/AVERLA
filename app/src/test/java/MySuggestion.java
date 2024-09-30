import android.content.Context;
import android.provider.SearchRecentSuggestions;

public class MySuggestion extends SearchRecentSuggestions {
    public MySuggestion(Context context, String authority, int mode) {
        super(context, authority, mode);
    }
}
