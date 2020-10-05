// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: album.proto

package dustin.examples.protobuf;

public final class AlbumProtos {
  private AlbumProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AlbumOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Album)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string title = 1;</code>
     * @return The title.
     */
    java.lang.String getTitle();
    /**
     * <code>string title = 1;</code>
     * @return The bytes for title.
     */
    com.google.protobuf.ByteString
        getTitleBytes();

    /**
     * <code>repeated string artist = 2;</code>
     * @return A list containing the artist.
     */
    java.util.List<java.lang.String>
        getArtistList();
    /**
     * <code>repeated string artist = 2;</code>
     * @return The count of artist.
     */
    int getArtistCount();
    /**
     * <code>repeated string artist = 2;</code>
     * @param index The index of the element to return.
     * @return The artist at the given index.
     */
    java.lang.String getArtist(int index);
    /**
     * <code>repeated string artist = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the artist at the given index.
     */
    com.google.protobuf.ByteString
        getArtistBytes(int index);

    /**
     * <code>int32 release_year = 3;</code>
     * @return The releaseYear.
     */
    int getReleaseYear();

    /**
     * <code>repeated string song_title = 4;</code>
     * @return A list containing the songTitle.
     */
    java.util.List<java.lang.String>
        getSongTitleList();
    /**
     * <code>repeated string song_title = 4;</code>
     * @return The count of songTitle.
     */
    int getSongTitleCount();
    /**
     * <code>repeated string song_title = 4;</code>
     * @param index The index of the element to return.
     * @return The songTitle at the given index.
     */
    java.lang.String getSongTitle(int index);
    /**
     * <code>repeated string song_title = 4;</code>
     * @param index The index of the value to return.
     * @return The bytes of the songTitle at the given index.
     */
    com.google.protobuf.ByteString
        getSongTitleBytes(int index);
  }
  /**
   * Protobuf type {@code Album}
   */
  public static final class Album extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Album)
      AlbumOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Album.newBuilder() to construct.
    private Album(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Album() {
      title_ = "";
      artist_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      songTitle_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Album();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Album(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              title_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                artist_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              artist_.add(s);
              break;
            }
            case 24: {

              releaseYear_ = input.readInt32();
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                songTitle_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000002;
              }
              songTitle_.add(s);
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          artist_ = artist_.getUnmodifiableView();
        }
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          songTitle_ = songTitle_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return dustin.examples.protobuf.AlbumProtos.internal_static_Album_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return dustin.examples.protobuf.AlbumProtos.internal_static_Album_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              dustin.examples.protobuf.AlbumProtos.Album.class, dustin.examples.protobuf.AlbumProtos.Album.Builder.class);
    }

    public static final int TITLE_FIELD_NUMBER = 1;
    private volatile java.lang.Object title_;
    /**
     * <code>string title = 1;</code>
     * @return The title.
     */
    @java.lang.Override
    public java.lang.String getTitle() {
      java.lang.Object ref = title_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        title_ = s;
        return s;
      }
    }
    /**
     * <code>string title = 1;</code>
     * @return The bytes for title.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ARTIST_FIELD_NUMBER = 2;
    private com.google.protobuf.LazyStringList artist_;
    /**
     * <code>repeated string artist = 2;</code>
     * @return A list containing the artist.
     */
    public com.google.protobuf.ProtocolStringList
        getArtistList() {
      return artist_;
    }
    /**
     * <code>repeated string artist = 2;</code>
     * @return The count of artist.
     */
    public int getArtistCount() {
      return artist_.size();
    }
    /**
     * <code>repeated string artist = 2;</code>
     * @param index The index of the element to return.
     * @return The artist at the given index.
     */
    public java.lang.String getArtist(int index) {
      return artist_.get(index);
    }
    /**
     * <code>repeated string artist = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the artist at the given index.
     */
    public com.google.protobuf.ByteString
        getArtistBytes(int index) {
      return artist_.getByteString(index);
    }

    public static final int RELEASE_YEAR_FIELD_NUMBER = 3;
    private int releaseYear_;
    /**
     * <code>int32 release_year = 3;</code>
     * @return The releaseYear.
     */
    @java.lang.Override
    public int getReleaseYear() {
      return releaseYear_;
    }

    public static final int SONG_TITLE_FIELD_NUMBER = 4;
    private com.google.protobuf.LazyStringList songTitle_;
    /**
     * <code>repeated string song_title = 4;</code>
     * @return A list containing the songTitle.
     */
    public com.google.protobuf.ProtocolStringList
        getSongTitleList() {
      return songTitle_;
    }
    /**
     * <code>repeated string song_title = 4;</code>
     * @return The count of songTitle.
     */
    public int getSongTitleCount() {
      return songTitle_.size();
    }
    /**
     * <code>repeated string song_title = 4;</code>
     * @param index The index of the element to return.
     * @return The songTitle at the given index.
     */
    public java.lang.String getSongTitle(int index) {
      return songTitle_.get(index);
    }
    /**
     * <code>repeated string song_title = 4;</code>
     * @param index The index of the value to return.
     * @return The bytes of the songTitle at the given index.
     */
    public com.google.protobuf.ByteString
        getSongTitleBytes(int index) {
      return songTitle_.getByteString(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getTitleBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, title_);
      }
      for (int i = 0; i < artist_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, artist_.getRaw(i));
      }
      if (releaseYear_ != 0) {
        output.writeInt32(3, releaseYear_);
      }
      for (int i = 0; i < songTitle_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, songTitle_.getRaw(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getTitleBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, title_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < artist_.size(); i++) {
          dataSize += computeStringSizeNoTag(artist_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getArtistList().size();
      }
      if (releaseYear_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, releaseYear_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < songTitle_.size(); i++) {
          dataSize += computeStringSizeNoTag(songTitle_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getSongTitleList().size();
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof dustin.examples.protobuf.AlbumProtos.Album)) {
        return super.equals(obj);
      }
      dustin.examples.protobuf.AlbumProtos.Album other = (dustin.examples.protobuf.AlbumProtos.Album) obj;

      if (!getTitle()
          .equals(other.getTitle())) return false;
      if (!getArtistList()
          .equals(other.getArtistList())) return false;
      if (getReleaseYear()
          != other.getReleaseYear()) return false;
      if (!getSongTitleList()
          .equals(other.getSongTitleList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TITLE_FIELD_NUMBER;
      hash = (53 * hash) + getTitle().hashCode();
      if (getArtistCount() > 0) {
        hash = (37 * hash) + ARTIST_FIELD_NUMBER;
        hash = (53 * hash) + getArtistList().hashCode();
      }
      hash = (37 * hash) + RELEASE_YEAR_FIELD_NUMBER;
      hash = (53 * hash) + getReleaseYear();
      if (getSongTitleCount() > 0) {
        hash = (37 * hash) + SONG_TITLE_FIELD_NUMBER;
        hash = (53 * hash) + getSongTitleList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static dustin.examples.protobuf.AlbumProtos.Album parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static dustin.examples.protobuf.AlbumProtos.Album parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static dustin.examples.protobuf.AlbumProtos.Album parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static dustin.examples.protobuf.AlbumProtos.Album parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static dustin.examples.protobuf.AlbumProtos.Album parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static dustin.examples.protobuf.AlbumProtos.Album parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static dustin.examples.protobuf.AlbumProtos.Album parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static dustin.examples.protobuf.AlbumProtos.Album parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static dustin.examples.protobuf.AlbumProtos.Album parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static dustin.examples.protobuf.AlbumProtos.Album parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static dustin.examples.protobuf.AlbumProtos.Album parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static dustin.examples.protobuf.AlbumProtos.Album parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(dustin.examples.protobuf.AlbumProtos.Album prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Album}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Album)
        dustin.examples.protobuf.AlbumProtos.AlbumOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return dustin.examples.protobuf.AlbumProtos.internal_static_Album_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return dustin.examples.protobuf.AlbumProtos.internal_static_Album_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                dustin.examples.protobuf.AlbumProtos.Album.class, dustin.examples.protobuf.AlbumProtos.Album.Builder.class);
      }

      // Construct using dustin.examples.protobuf.AlbumProtos.Album.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        title_ = "";

        artist_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        releaseYear_ = 0;

        songTitle_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return dustin.examples.protobuf.AlbumProtos.internal_static_Album_descriptor;
      }

      @java.lang.Override
      public dustin.examples.protobuf.AlbumProtos.Album getDefaultInstanceForType() {
        return dustin.examples.protobuf.AlbumProtos.Album.getDefaultInstance();
      }

      @java.lang.Override
      public dustin.examples.protobuf.AlbumProtos.Album build() {
        dustin.examples.protobuf.AlbumProtos.Album result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public dustin.examples.protobuf.AlbumProtos.Album buildPartial() {
        dustin.examples.protobuf.AlbumProtos.Album result = new dustin.examples.protobuf.AlbumProtos.Album(this);
        int from_bitField0_ = bitField0_;
        result.title_ = title_;
        if (((bitField0_ & 0x00000001) != 0)) {
          artist_ = artist_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.artist_ = artist_;
        result.releaseYear_ = releaseYear_;
        if (((bitField0_ & 0x00000002) != 0)) {
          songTitle_ = songTitle_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.songTitle_ = songTitle_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof dustin.examples.protobuf.AlbumProtos.Album) {
          return mergeFrom((dustin.examples.protobuf.AlbumProtos.Album)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(dustin.examples.protobuf.AlbumProtos.Album other) {
        if (other == dustin.examples.protobuf.AlbumProtos.Album.getDefaultInstance()) return this;
        if (!other.getTitle().isEmpty()) {
          title_ = other.title_;
          onChanged();
        }
        if (!other.artist_.isEmpty()) {
          if (artist_.isEmpty()) {
            artist_ = other.artist_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureArtistIsMutable();
            artist_.addAll(other.artist_);
          }
          onChanged();
        }
        if (other.getReleaseYear() != 0) {
          setReleaseYear(other.getReleaseYear());
        }
        if (!other.songTitle_.isEmpty()) {
          if (songTitle_.isEmpty()) {
            songTitle_ = other.songTitle_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureSongTitleIsMutable();
            songTitle_.addAll(other.songTitle_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        dustin.examples.protobuf.AlbumProtos.Album parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (dustin.examples.protobuf.AlbumProtos.Album) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object title_ = "";
      /**
       * <code>string title = 1;</code>
       * @return The title.
       */
      public java.lang.String getTitle() {
        java.lang.Object ref = title_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          title_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string title = 1;</code>
       * @return The bytes for title.
       */
      public com.google.protobuf.ByteString
          getTitleBytes() {
        java.lang.Object ref = title_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          title_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string title = 1;</code>
       * @param value The title to set.
       * @return This builder for chaining.
       */
      public Builder setTitle(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        title_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string title = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearTitle() {
        
        title_ = getDefaultInstance().getTitle();
        onChanged();
        return this;
      }
      /**
       * <code>string title = 1;</code>
       * @param value The bytes for title to set.
       * @return This builder for chaining.
       */
      public Builder setTitleBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        title_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList artist_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureArtistIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          artist_ = new com.google.protobuf.LazyStringArrayList(artist_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated string artist = 2;</code>
       * @return A list containing the artist.
       */
      public com.google.protobuf.ProtocolStringList
          getArtistList() {
        return artist_.getUnmodifiableView();
      }
      /**
       * <code>repeated string artist = 2;</code>
       * @return The count of artist.
       */
      public int getArtistCount() {
        return artist_.size();
      }
      /**
       * <code>repeated string artist = 2;</code>
       * @param index The index of the element to return.
       * @return The artist at the given index.
       */
      public java.lang.String getArtist(int index) {
        return artist_.get(index);
      }
      /**
       * <code>repeated string artist = 2;</code>
       * @param index The index of the value to return.
       * @return The bytes of the artist at the given index.
       */
      public com.google.protobuf.ByteString
          getArtistBytes(int index) {
        return artist_.getByteString(index);
      }
      /**
       * <code>repeated string artist = 2;</code>
       * @param index The index to set the value at.
       * @param value The artist to set.
       * @return This builder for chaining.
       */
      public Builder setArtist(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureArtistIsMutable();
        artist_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string artist = 2;</code>
       * @param value The artist to add.
       * @return This builder for chaining.
       */
      public Builder addArtist(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureArtistIsMutable();
        artist_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string artist = 2;</code>
       * @param values The artist to add.
       * @return This builder for chaining.
       */
      public Builder addAllArtist(
          java.lang.Iterable<java.lang.String> values) {
        ensureArtistIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, artist_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string artist = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearArtist() {
        artist_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string artist = 2;</code>
       * @param value The bytes of the artist to add.
       * @return This builder for chaining.
       */
      public Builder addArtistBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureArtistIsMutable();
        artist_.add(value);
        onChanged();
        return this;
      }

      private int releaseYear_ ;
      /**
       * <code>int32 release_year = 3;</code>
       * @return The releaseYear.
       */
      @java.lang.Override
      public int getReleaseYear() {
        return releaseYear_;
      }
      /**
       * <code>int32 release_year = 3;</code>
       * @param value The releaseYear to set.
       * @return This builder for chaining.
       */
      public Builder setReleaseYear(int value) {
        
        releaseYear_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 release_year = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearReleaseYear() {
        
        releaseYear_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList songTitle_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureSongTitleIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          songTitle_ = new com.google.protobuf.LazyStringArrayList(songTitle_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated string song_title = 4;</code>
       * @return A list containing the songTitle.
       */
      public com.google.protobuf.ProtocolStringList
          getSongTitleList() {
        return songTitle_.getUnmodifiableView();
      }
      /**
       * <code>repeated string song_title = 4;</code>
       * @return The count of songTitle.
       */
      public int getSongTitleCount() {
        return songTitle_.size();
      }
      /**
       * <code>repeated string song_title = 4;</code>
       * @param index The index of the element to return.
       * @return The songTitle at the given index.
       */
      public java.lang.String getSongTitle(int index) {
        return songTitle_.get(index);
      }
      /**
       * <code>repeated string song_title = 4;</code>
       * @param index The index of the value to return.
       * @return The bytes of the songTitle at the given index.
       */
      public com.google.protobuf.ByteString
          getSongTitleBytes(int index) {
        return songTitle_.getByteString(index);
      }
      /**
       * <code>repeated string song_title = 4;</code>
       * @param index The index to set the value at.
       * @param value The songTitle to set.
       * @return This builder for chaining.
       */
      public Builder setSongTitle(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureSongTitleIsMutable();
        songTitle_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string song_title = 4;</code>
       * @param value The songTitle to add.
       * @return This builder for chaining.
       */
      public Builder addSongTitle(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureSongTitleIsMutable();
        songTitle_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string song_title = 4;</code>
       * @param values The songTitle to add.
       * @return This builder for chaining.
       */
      public Builder addAllSongTitle(
          java.lang.Iterable<java.lang.String> values) {
        ensureSongTitleIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, songTitle_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string song_title = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearSongTitle() {
        songTitle_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string song_title = 4;</code>
       * @param value The bytes of the songTitle to add.
       * @return This builder for chaining.
       */
      public Builder addSongTitleBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureSongTitleIsMutable();
        songTitle_.add(value);
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Album)
    }

    // @@protoc_insertion_point(class_scope:Album)
    private static final dustin.examples.protobuf.AlbumProtos.Album DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new dustin.examples.protobuf.AlbumProtos.Album();
    }

    public static dustin.examples.protobuf.AlbumProtos.Album getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Album>
        PARSER = new com.google.protobuf.AbstractParser<Album>() {
      @java.lang.Override
      public Album parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Album(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Album> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Album> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public dustin.examples.protobuf.AlbumProtos.Album getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Album_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Album_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013album.proto\"P\n\005Album\022\r\n\005title\030\001 \001(\t\022\016\n" +
      "\006artist\030\002 \003(\t\022\024\n\014release_year\030\003 \001(\005\022\022\n\ns" +
      "ong_title\030\004 \003(\tB\'\n\030dustin.examples.proto" +
      "bufB\013AlbumProtosb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Album_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Album_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Album_descriptor,
        new java.lang.String[] { "Title", "Artist", "ReleaseYear", "SongTitle", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
