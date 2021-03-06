/* DO NOT EDIT */
/* This file was generated from files.stone */

package autosaveworld.zlibs.com.dropbox.core.v2.files;

import java.io.IOException;
import java.util.Arrays;

import autosaveworld.zlibs.com.dropbox.core.stone.UnionSerializer;
import autosaveworld.zlibs.com.fasterxml.jackson.core.JsonGenerationException;
import autosaveworld.zlibs.com.fasterxml.jackson.core.JsonGenerator;
import autosaveworld.zlibs.com.fasterxml.jackson.core.JsonParseException;
import autosaveworld.zlibs.com.fasterxml.jackson.core.JsonParser;
import autosaveworld.zlibs.com.fasterxml.jackson.core.JsonToken;

/**
 * This class is a tagged union.  Tagged unions instances are always associated
 * to a specific tag.  This means only one of the {@code isAbc()} methods will
 * return {@code true}. You can use {@link #tag()} to determine the tag
 * associated with this instance.
 */
public final class UploadSessionFinishBatchResultEntry {
    // union files.UploadSessionFinishBatchResultEntry (files.stone)

    /**
     * Discriminating tag type for {@link UploadSessionFinishBatchResultEntry}.
     */
    public enum Tag {
        SUCCESS, // FileMetadata
        FAILURE; // UploadSessionFinishError
    }

    private final Tag _tag;
    private final FileMetadata successValue;
    private final UploadSessionFinishError failureValue;

    /**
     *
     * @param successValue  Must not be {@code null}.
     * @param failureValue  Must not be {@code null}.
     * @param _tag  Discriminating tag for this instance.
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    private UploadSessionFinishBatchResultEntry(Tag _tag, FileMetadata successValue, UploadSessionFinishError failureValue) {
        this._tag = _tag;
        this.successValue = successValue;
        this.failureValue = failureValue;
    }

    /**
     * Returns the tag for this instance.
     *
     * <p> This class is a tagged union.  Tagged unions instances are always
     * associated to a specific tag.  This means only one of the {@code isXyz()}
     * methods will return {@code true}. Callers are recommended to use the tag
     * value in a {@code switch} statement to properly handle the different
     * values for this {@code UploadSessionFinishBatchResultEntry}. </p>
     *
     * @return the tag for this instance.
     */
    public Tag tag() {
        return _tag;
    }

    /**
     * Returns {@code true} if this instance has the tag {@link Tag#SUCCESS},
     * {@code false} otherwise.
     *
     * @return {@code true} if this instance is tagged as {@link Tag#SUCCESS},
     *     {@code false} otherwise.
     */
    public boolean isSuccess() {
        return this._tag == Tag.SUCCESS;
    }

    /**
     * Returns an instance of {@code UploadSessionFinishBatchResultEntry} that
     * has its tag set to {@link Tag#SUCCESS}.
     *
     * <p> None </p>
     *
     * @param value  value to assign to this instance.
     *
     * @return Instance of {@code UploadSessionFinishBatchResultEntry} with its
     *     tag set to {@link Tag#SUCCESS}.
     *
     * @throws IllegalArgumentException  if {@code value} is {@code null}.
     */
    public static UploadSessionFinishBatchResultEntry success(FileMetadata value) {
        if (value == null) {
            throw new IllegalArgumentException("Value is null");
        }
        return new UploadSessionFinishBatchResultEntry(Tag.SUCCESS, value, null);
    }

    /**
     * This instance must be tagged as {@link Tag#SUCCESS}.
     *
     * @return The {@link FileMetadata} value associated with this instance if
     *     {@link #isSuccess} is {@code true}.
     *
     * @throws IllegalStateException  If {@link #isSuccess} is {@code false}.
     */
    public FileMetadata getSuccessValue() {
        if (this._tag != Tag.SUCCESS) {
            throw new IllegalStateException("Invalid tag: required Tag.SUCCESS, but was Tag." + this._tag.name());
        }
        return successValue;
    }

    /**
     * Returns {@code true} if this instance has the tag {@link Tag#FAILURE},
     * {@code false} otherwise.
     *
     * @return {@code true} if this instance is tagged as {@link Tag#FAILURE},
     *     {@code false} otherwise.
     */
    public boolean isFailure() {
        return this._tag == Tag.FAILURE;
    }

    /**
     * Returns an instance of {@code UploadSessionFinishBatchResultEntry} that
     * has its tag set to {@link Tag#FAILURE}.
     *
     * <p> None </p>
     *
     * @param value  value to assign to this instance.
     *
     * @return Instance of {@code UploadSessionFinishBatchResultEntry} with its
     *     tag set to {@link Tag#FAILURE}.
     *
     * @throws IllegalArgumentException  if {@code value} is {@code null}.
     */
    public static UploadSessionFinishBatchResultEntry failure(UploadSessionFinishError value) {
        if (value == null) {
            throw new IllegalArgumentException("Value is null");
        }
        return new UploadSessionFinishBatchResultEntry(Tag.FAILURE, null, value);
    }

    /**
     * This instance must be tagged as {@link Tag#FAILURE}.
     *
     * @return The {@link UploadSessionFinishError} value associated with this
     *     instance if {@link #isFailure} is {@code true}.
     *
     * @throws IllegalStateException  If {@link #isFailure} is {@code false}.
     */
    public UploadSessionFinishError getFailureValue() {
        if (this._tag != Tag.FAILURE) {
            throw new IllegalStateException("Invalid tag: required Tag.FAILURE, but was Tag." + this._tag.name());
        }
        return failureValue;
    }

    @Override
    public int hashCode() {
        int hash = Arrays.hashCode(new Object [] {
            _tag,
            successValue,
            failureValue
        });
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        else if (obj instanceof UploadSessionFinishBatchResultEntry) {
            UploadSessionFinishBatchResultEntry other = (UploadSessionFinishBatchResultEntry) obj;
            if (this._tag != other._tag) {
                return false;
            }
            switch (_tag) {
                case SUCCESS:
                    return (this.successValue == other.successValue) || (this.successValue.equals(other.successValue));
                case FAILURE:
                    return (this.failureValue == other.failureValue) || (this.failureValue.equals(other.failureValue));
                default:
                    return false;
            }
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return Serializer.INSTANCE.serialize(this, false);
    }

    /**
     * Returns a String representation of this object formatted for easier
     * readability.
     *
     * <p> The returned String may contain newlines. </p>
     *
     * @return Formatted, multiline String representation of this object
     */
    public String toStringMultiline() {
        return Serializer.INSTANCE.serialize(this, true);
    }

    /**
     * For internal use only.
     */
    static class Serializer extends UnionSerializer<UploadSessionFinishBatchResultEntry> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(UploadSessionFinishBatchResultEntry value, JsonGenerator g) throws IOException, JsonGenerationException {
            switch (value.tag()) {
                case SUCCESS: {
                    g.writeStartObject();
                    writeTag("success", g);
                    FileMetadata.Serializer.INSTANCE.serialize(value.successValue, g, true);
                    g.writeEndObject();
                    break;
                }
                case FAILURE: {
                    g.writeStartObject();
                    writeTag("failure", g);
                    g.writeFieldName("failure");
                    UploadSessionFinishError.Serializer.INSTANCE.serialize(value.failureValue, g);
                    g.writeEndObject();
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Unrecognized tag: " + value.tag());
                }
            }
        }

        @Override
        public UploadSessionFinishBatchResultEntry deserialize(JsonParser p) throws IOException, JsonParseException {
            UploadSessionFinishBatchResultEntry value;
            boolean collapsed;
            String tag;
            if (p.getCurrentToken() == JsonToken.VALUE_STRING) {
                collapsed = true;
                tag = getStringValue(p);
                p.nextToken();
            }
            else {
                collapsed = false;
                expectStartObject(p);
                tag = readTag(p);
            }
            if (tag == null) {
                throw new JsonParseException(p, "Required field missing: " + TAG_FIELD);
            }
            else if ("success".equals(tag)) {
                FileMetadata fieldValue = null;
                fieldValue = FileMetadata.Serializer.INSTANCE.deserialize(p, true);
                value = UploadSessionFinishBatchResultEntry.success(fieldValue);
            }
            else if ("failure".equals(tag)) {
                UploadSessionFinishError fieldValue = null;
                expectField("failure", p);
                fieldValue = UploadSessionFinishError.Serializer.INSTANCE.deserialize(p);
                value = UploadSessionFinishBatchResultEntry.failure(fieldValue);
            }
            else {
                throw new JsonParseException(p, "Unknown tag: " + tag);
            }
            if (!collapsed) {
                expectEndObject(p);
            }
            return value;
        }
    }
}
