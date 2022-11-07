public class org.anddev.andengine.opengl.texture.TextureManager {
	 /* # instance fields */
	 private final java.util.ArrayList mTexturesLoaded;
	 private final java.util.HashSet mTexturesManaged;
	 private final java.util.ArrayList mTexturesToBeLoaded;
	 private final java.util.ArrayList mTexturesToBeUnloaded;
	 /* # direct methods */
	 public org.anddev.andengine.opengl.texture.TextureManager ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Ljava/util/HashSet; */
		 /* invoke-direct {v0}, Ljava/util/HashSet;-><init>()V */
		 this.mTexturesManaged = v0;
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.mTexturesLoaded = v0;
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.mTexturesToBeLoaded = v0;
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.mTexturesToBeUnloaded = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void clear ( ) {
		 /* .locals 1 */
		 v0 = this.mTexturesToBeLoaded;
		 (( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
		 v0 = this.mTexturesLoaded;
		 (( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
		 v0 = this.mTexturesManaged;
		 (( java.util.HashSet ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/HashSet;->clear()V
		 return;
	 } // .end method
	 public Boolean loadTexture ( org.anddev.andengine.opengl.texture.ITexture p0 ) {
		 /* .locals 1 */
		 v0 = this.mTexturesManaged;
		 v0 = 		 (( java.util.HashSet ) v0 ).contains ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.mTexturesToBeUnloaded;
			 (( java.util.ArrayList ) v0 ).remove ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
			 int v0 = 0; // const/4 v0, 0x0
		 } // :goto_0
	 } // :cond_0
	 v0 = this.mTexturesManaged;
	 (( java.util.HashSet ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
	 v0 = this.mTexturesToBeLoaded;
	 (( java.util.ArrayList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
	 int v0 = 1; // const/4 v0, 0x1
} // .end method
public void loadTextures ( org.anddev.andengine.opengl.texture.ITexture...p0 ) {
	 /* .locals 2 */
	 /* array-length v0, p1 */
	 int v1 = 1; // const/4 v1, 0x1
	 /* sub-int/2addr v0, v1 */
} // :goto_0
/* if-gez v0, :cond_0 */
return;
} // :cond_0
/* aget-object v1, p1, v0 */
(( org.anddev.andengine.opengl.texture.TextureManager ) p0 ).loadTexture ( v1 ); // invoke-virtual {p0, v1}, Lorg/anddev/andengine/opengl/texture/TextureManager;->loadTexture(Lorg/anddev/andengine/opengl/texture/ITexture;)Z
/* add-int/lit8 v0, v0, -0x1 */
} // .end method
public void reloadTextures ( ) {
/* .locals 3 */
v0 = this.mTexturesManaged;
(( java.util.HashSet ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;
v0 = } // :goto_0
/* if-nez v0, :cond_0 */
v0 = this.mTexturesToBeLoaded;
v1 = this.mTexturesLoaded;
(( java.util.ArrayList ) v0 ).addAll ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
v0 = this.mTexturesLoaded;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
v0 = this.mTexturesManaged;
v1 = this.mTexturesToBeUnloaded;
(( java.util.HashSet ) v0 ).removeAll ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/HashSet;->removeAll(Ljava/util/Collection;)Z
v0 = this.mTexturesToBeUnloaded;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
return;
} // :cond_0
/* check-cast v0, Lorg/anddev/andengine/opengl/texture/ITexture; */
int v2 = 0; // const/4 v2, 0x0
} // .end method
public Boolean unloadTexture ( org.anddev.andengine.opengl.texture.ITexture p0 ) {
/* .locals 1 */
v0 = this.mTexturesManaged;
v0 = (( java.util.HashSet ) v0 ).contains ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.mTexturesLoaded;
v0 = (( java.util.ArrayList ) v0 ).contains ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.mTexturesToBeUnloaded;
(( java.util.ArrayList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
} // :cond_0
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
} // :cond_1
v0 = this.mTexturesToBeLoaded;
v0 = (( java.util.ArrayList ) v0 ).remove ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mTexturesManaged;
(( java.util.HashSet ) v0 ).remove ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void unloadTextures ( org.anddev.andengine.opengl.texture.ITexture...p0 ) {
/* .locals 2 */
/* array-length v0, p1 */
int v1 = 1; // const/4 v1, 0x1
/* sub-int/2addr v0, v1 */
} // :goto_0
/* if-gez v0, :cond_0 */
return;
} // :cond_0
/* aget-object v1, p1, v0 */
(( org.anddev.andengine.opengl.texture.TextureManager ) p0 ).unloadTexture ( v1 ); // invoke-virtual {p0, v1}, Lorg/anddev/andengine/opengl/texture/TextureManager;->unloadTexture(Lorg/anddev/andengine/opengl/texture/ITexture;)Z
/* add-int/lit8 v0, v0, -0x1 */
} // .end method
public void updateTextures ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 8 */
int v7 = 1; // const/4 v7, 0x1
v0 = this.mTexturesManaged;
v1 = this.mTexturesLoaded;
v2 = this.mTexturesToBeLoaded;
v3 = this.mTexturesToBeUnloaded;
v4 = (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
/* if-lez v4, :cond_0 */
/* sub-int/2addr v4, v7 */
} // :goto_0
/* if-gez v4, :cond_5 */
} // :cond_0
v4 = (( java.util.ArrayList ) v2 ).size ( ); // invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
/* if-lez v4, :cond_1 */
/* sub-int v5, v4, v7 */
} // :goto_1
/* if-gez v5, :cond_7 */
} // :cond_1
v2 = (( java.util.ArrayList ) v3 ).size ( ); // invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
/* if-lez v2, :cond_2 */
/* sub-int v5, v2, v7 */
} // :goto_2
/* if-gez v5, :cond_9 */
} // :cond_2
/* if-gtz v4, :cond_3 */
/* if-lez v2, :cond_4 */
} // :cond_3
java.lang.System .gc ( );
} // :cond_4
return;
} // :cond_5
(( java.util.ArrayList ) v1 ).get ( v4 ); // invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
v5 = /* check-cast p0, Lorg/anddev/andengine/opengl/texture/ITexture; */
if ( v5 != null) { // if-eqz v5, :cond_6
try { // :try_start_0
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :cond_6
} // :goto_3
/* add-int/lit8 v4, v4, -0x1 */
/* :catch_0 */
/* move-exception v5 */
org.anddev.andengine.util.Debug .e ( v5 );
} // :cond_7
(( java.util.ArrayList ) v2 ).remove ( v5 ); // invoke-virtual {v2, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
v6 = /* check-cast p0, Lorg/anddev/andengine/opengl/texture/ITexture; */
/* if-nez v6, :cond_8 */
try { // :try_start_1
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_1 */
} // :cond_8
} // :goto_4
(( java.util.ArrayList ) v1 ).add ( p0 ); // invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* add-int/lit8 v5, v5, -0x1 */
/* :catch_1 */
/* move-exception v6 */
org.anddev.andengine.util.Debug .e ( v6 );
} // :cond_9
(( java.util.ArrayList ) v3 ).remove ( v5 ); // invoke-virtual {v3, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
v6 = /* check-cast p0, Lorg/anddev/andengine/opengl/texture/ITexture; */
if ( v6 != null) { // if-eqz v6, :cond_a
} // :cond_a
(( java.util.ArrayList ) v1 ).remove ( p0 ); // invoke-virtual {v1, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
(( java.util.HashSet ) v0 ).remove ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z
/* add-int/lit8 v5, v5, -0x1 */
} // .end method
