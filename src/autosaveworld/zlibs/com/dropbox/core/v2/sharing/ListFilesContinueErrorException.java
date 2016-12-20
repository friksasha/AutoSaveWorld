/* DO NOT EDIT */
/* This file was generated by Stone */

package autosaveworld.zlibs.com.dropbox.core.v2.sharing;

import autosaveworld.zlibs.com.dropbox.core.DbxApiException;
import autosaveworld.zlibs.com.dropbox.core.LocalizedText;

/**
 * Exception thrown when the server responds with a {@link
 * ListFilesContinueError} error.
 *
 * <p> This exception is raised by {@link
 * DbxUserSharingRequests#listReceivedFilesContinue(String)}. </p>
 */
public class ListFilesContinueErrorException extends DbxApiException {
    // exception for routes:
    //     2/sharing/list_received_files/continue

    private static final long serialVersionUID = 0L;

    /**
     * The error reported by {@link
     * DbxUserSharingRequests#listReceivedFilesContinue(String)}.
     */
    public final ListFilesContinueError errorValue;

    public ListFilesContinueErrorException(String routeName, String requestId, LocalizedText userMessage, ListFilesContinueError errorValue) {
        super(requestId, userMessage, buildMessage(routeName, userMessage, errorValue));
        if (errorValue == null) {
            throw new NullPointerException("errorValue");
        }
        this.errorValue = errorValue;
    }
}