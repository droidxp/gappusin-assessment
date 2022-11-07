public class org.anddev.andengine.opengl.font.Letter {
	 /* # instance fields */
	 public final Integer mAdvance;
	 public final Object mCharacter;
	 public final Integer mHeight;
	 public final Float mTextureHeight;
	 public final Float mTextureWidth;
	 public final Float mTextureX;
	 public final Float mTextureY;
	 public final Integer mWidth;
	 /* # direct methods */
	 org.anddev.andengine.opengl.font.Letter ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput-char p1, p0, Lorg/anddev/andengine/opengl/font/Letter;->mCharacter:C */
		 /* iput p2, p0, Lorg/anddev/andengine/opengl/font/Letter;->mAdvance:I */
		 /* iput p3, p0, Lorg/anddev/andengine/opengl/font/Letter;->mWidth:I */
		 /* iput p4, p0, Lorg/anddev/andengine/opengl/font/Letter;->mHeight:I */
		 /* iput p5, p0, Lorg/anddev/andengine/opengl/font/Letter;->mTextureX:F */
		 /* iput p6, p0, Lorg/anddev/andengine/opengl/font/Letter;->mTextureY:F */
		 /* iput p7, p0, Lorg/anddev/andengine/opengl/font/Letter;->mTextureWidth:F */
		 /* iput p8, p0, Lorg/anddev/andengine/opengl/font/Letter;->mTextureHeight:F */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean equals ( java.lang.Object p0 ) {
		 /* .locals 4 */
		 int v3 = 1; // const/4 v3, 0x1
		 int v2 = 0; // const/4 v2, 0x0
		 /* if-ne p0, p1, :cond_0 */
		 /* move v0, v3 */
	 } // :goto_0
} // :cond_0
/* if-nez p1, :cond_1 */
/* move v0, v2 */
} // :cond_1
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* if-eq v0, v1, :cond_2 */
/* move v0, v2 */
} // :cond_2
/* check-cast p1, Lorg/anddev/andengine/opengl/font/Letter; */
/* iget-char v0, p0, Lorg/anddev/andengine/opengl/font/Letter;->mCharacter:C */
/* iget-char v1, p1, Lorg/anddev/andengine/opengl/font/Letter;->mCharacter:C */
/* if-eq v0, v1, :cond_3 */
/* move v0, v2 */
} // :cond_3
/* move v0, v3 */
} // .end method
public Integer hashCode ( ) {
/* .locals 1 */
/* iget-char v0, p0, Lorg/anddev/andengine/opengl/font/Letter;->mCharacter:C */
/* add-int/lit8 v0, v0, 0x1f */
} // .end method
