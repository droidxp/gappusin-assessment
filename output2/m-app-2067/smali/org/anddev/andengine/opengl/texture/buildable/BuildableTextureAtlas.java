public class org.anddev.andengine.opengl.texture.buildable.BuildableTextureAtlas implements org.anddev.andengine.opengl.texture.atlas.ITextureAtlas {
	 /* # interfaces */
	 /* # instance fields */
	 private final org.anddev.andengine.opengl.texture.atlas.ITextureAtlas mTextureAtlas;
	 private final java.util.ArrayList mTextureAtlasSourcesToPlace;
	 /* # direct methods */
	 public org.anddev.andengine.opengl.texture.buildable.BuildableTextureAtlas ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.mTextureAtlasSourcesToPlace = v0;
		 this.mTextureAtlas = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void addTextureAtlasSource ( org.anddev.andengine.opengl.texture.source.ITextureAtlasSource p0, Integer p1, Integer p2 ) {
		 /* .locals 1 */
		 v0 = this.mTextureAtlas;
		 return;
	 } // .end method
	 public void addTextureAtlasSource ( org.anddev.andengine.opengl.texture.source.ITextureAtlasSource p0, org.anddev.andengine.util.Callback p1 ) {
		 /* .locals 2 */
		 v0 = this.mTextureAtlasSourcesToPlace;
		 /* new-instance v1, Lorg/anddev/andengine/opengl/texture/buildable/BuildableTextureAtlas$TextureAtlasSourceWithWithLocationCallback; */
		 /* invoke-direct {v1, p1, p2}, Lorg/anddev/andengine/opengl/texture/buildable/BuildableTextureAtlas$TextureAtlasSourceWithWithLocationCallback;-><init>(Lorg/anddev/andengine/opengl/texture/source/ITextureAtlasSource;Lorg/anddev/andengine/util/Callback;)V */
		 (( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
		 return;
	 } // .end method
	 public void bind ( javax.microedition.khronos.opengles.GL10 p0 ) {
		 /* .locals 1 */
		 v0 = this.mTextureAtlas;
		 return;
	 } // .end method
	 public void build ( org.anddev.andengine.opengl.texture.buildable.builder.ITextureBuilder p0 ) {
		 /* .locals 2 */
		 v0 = this.mTextureAtlas;
		 v1 = this.mTextureAtlasSourcesToPlace;
		 v0 = this.mTextureAtlasSourcesToPlace;
		 (( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
		 v0 = this.mTextureAtlas;
		 int v1 = 1; // const/4 v1, 0x1
		 return;
	 } // .end method
	 public void clearTextureAtlasSources ( ) {
		 /* .locals 1 */
		 v0 = this.mTextureAtlas;
		 v0 = this.mTextureAtlasSourcesToPlace;
		 (( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
		 return;
	 } // .end method
	 public Integer getHardwareTextureID ( ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mTextureAtlas;
	 } // .end method
	 public Integer getHeight ( ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mTextureAtlas;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.TextureOptions getTextureOptions ( ) {
		 /* .locals 1 */
		 v0 = this.mTextureAtlas;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.ITexture$ITextureStateListener getTextureStateListener ( ) { //bridge//synthethic
		 /* .locals 1 */
		 (( org.anddev.andengine.opengl.texture.buildable.BuildableTextureAtlas ) p0 ).getTextureStateListener ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/buildable/BuildableTextureAtlas;->getTextureStateListener()Lorg/anddev/andengine/opengl/texture/atlas/ITextureAtlas$ITextureAtlasStateListener;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.atlas.ITextureAtlas$ITextureAtlasStateListener getTextureStateListener ( ) {
		 /* .locals 1 */
		 v0 = this.mTextureAtlas;
	 } // .end method
	 public Integer getWidth ( ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mTextureAtlas;
	 } // .end method
	 public Boolean hasTextureStateListener ( ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mTextureAtlas;
	 } // .end method
	 public Boolean isLoadedToHardware ( ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mTextureAtlas;
	 } // .end method
	 public Boolean isUpdateOnHardwareNeeded ( ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mTextureAtlas;
	 } // .end method
	 public void loadToHardware ( javax.microedition.khronos.opengles.GL10 p0 ) {
		 /* .locals 1 */
		 v0 = this.mTextureAtlas;
		 return;
	 } // .end method
	 public void reloadToHardware ( javax.microedition.khronos.opengles.GL10 p0 ) {
		 /* .locals 1 */
		 v0 = this.mTextureAtlas;
		 return;
	 } // .end method
	 public void removeTextureAtlasSource ( org.anddev.andengine.opengl.texture.source.ITextureAtlasSource p0 ) {
		 /* .locals 4 */
		 int v3 = 1; // const/4 v3, 0x1
		 v1 = this.mTextureAtlasSourcesToPlace;
		 v0 = 		 (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
		 /* sub-int/2addr v0, v3 */
		 /* move v2, v0 */
	 } // :goto_0
	 /* if-gez v2, :cond_0 */
} // :goto_1
return;
} // :cond_0
(( java.util.ArrayList ) v1 ).get ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lorg/anddev/andengine/opengl/texture/buildable/BuildableTextureAtlas$TextureAtlasSourceWithWithLocationCallback; */
org.anddev.andengine.opengl.texture.buildable.BuildableTextureAtlas$TextureAtlasSourceWithWithLocationCallback .access$0 ( v0 );
/* if-ne v0, p1, :cond_1 */
(( java.util.ArrayList ) v1 ).remove ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
v0 = this.mTextureAtlas;
} // :cond_1
/* add-int/lit8 v0, v2, -0x1 */
/* move v2, v0 */
} // .end method
public void removeTextureAtlasSource ( org.anddev.andengine.opengl.texture.source.ITextureAtlasSource p0, Integer p1, Integer p2 ) {
/* .locals 1 */
v0 = this.mTextureAtlas;
return;
} // .end method
public void setLoadedToHardware ( Boolean p0 ) {
/* .locals 1 */
v0 = this.mTextureAtlas;
return;
} // .end method
public void setUpdateOnHardwareNeeded ( Boolean p0 ) {
/* .locals 1 */
v0 = this.mTextureAtlas;
return;
} // .end method
public void unloadFromHardware ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 1 */
v0 = this.mTextureAtlas;
return;
} // .end method
