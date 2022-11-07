public class org.anddev.andengine.opengl.font.FontManager {
	 /* # instance fields */
	 private final java.util.ArrayList mFontsManaged;
	 /* # direct methods */
	 public org.anddev.andengine.opengl.font.FontManager ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.mFontsManaged = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void clear ( ) {
		 /* .locals 1 */
		 v0 = this.mFontsManaged;
		 (( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
		 return;
	 } // .end method
	 public void loadFont ( org.anddev.andengine.opengl.font.Font p0 ) {
		 /* .locals 2 */
		 /* if-nez p1, :cond_0 */
		 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
		 final String v1 = "pFont must not be null!"; // const-string v1, "pFont must not be null!"
		 /* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw v0 */
	 } // :cond_0
	 v0 = this.mFontsManaged;
	 (( java.util.ArrayList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
	 return;
} // .end method
public void loadFonts ( org.anddev.andengine.opengl.font.FontLibrary p0 ) {
	 /* .locals 0 */
	 (( org.anddev.andengine.opengl.font.FontLibrary ) p1 ).loadFonts ( p0 ); // invoke-virtual {p1, p0}, Lorg/anddev/andengine/opengl/font/FontLibrary;->loadFonts(Lorg/anddev/andengine/opengl/font/FontManager;)V
	 return;
} // .end method
public void loadFonts ( org.anddev.andengine.opengl.font.Font...p0 ) {
	 /* .locals 2 */
	 /* array-length v0, p1 */
	 int v1 = 1; // const/4 v1, 0x1
	 /* sub-int/2addr v0, v1 */
} // :goto_0
/* if-gez v0, :cond_0 */
return;
} // :cond_0
/* aget-object v1, p1, v0 */
(( org.anddev.andengine.opengl.font.FontManager ) p0 ).loadFont ( v1 ); // invoke-virtual {p0, v1}, Lorg/anddev/andengine/opengl/font/FontManager;->loadFont(Lorg/anddev/andengine/opengl/font/Font;)V
/* add-int/lit8 v0, v0, -0x1 */
} // .end method
public void reloadFonts ( ) {
/* .locals 3 */
v0 = this.mFontsManaged;
v1 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v2 = 1; // const/4 v2, 0x1
/* sub-int/2addr v1, v2 */
} // :goto_0
/* if-gez v1, :cond_0 */
return;
} // :cond_0
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast p0, Lorg/anddev/andengine/opengl/font/Font; */
(( org.anddev.andengine.opengl.font.Font ) p0 ).reload ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/font/Font;->reload()V
/* add-int/lit8 v1, v1, -0x1 */
} // .end method
public void updateFonts ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 3 */
v0 = this.mFontsManaged;
v1 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* if-lez v1, :cond_0 */
int v2 = 1; // const/4 v2, 0x1
/* sub-int/2addr v1, v2 */
} // :goto_0
/* if-gez v1, :cond_1 */
} // :cond_0
return;
} // :cond_1
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast p0, Lorg/anddev/andengine/opengl/font/Font; */
(( org.anddev.andengine.opengl.font.Font ) p0 ).update ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/opengl/font/Font;->update(Ljavax/microedition/khronos/opengles/GL10;)V
/* add-int/lit8 v1, v1, -0x1 */
} // .end method
