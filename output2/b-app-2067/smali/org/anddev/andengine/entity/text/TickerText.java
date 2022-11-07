public class org.anddev.andengine.entity.text.TickerText extends org.anddev.andengine.entity.text.Text {
	 /* # instance fields */
	 private Float mCharactersPerSecond;
	 private Integer mCharactersVisible;
	 private Float mDuration;
	 private Boolean mReverse;
	 private Float mSecondsElapsed;
	 /* # direct methods */
	 public org.anddev.andengine.entity.text.TickerText ( ) {
		 /* .locals 2 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct/range {p0 ..p5}, Lorg/anddev/andengine/entity/text/Text;-><init>(FFLorg/anddev/andengine/opengl/font/Font;Ljava/lang/String;Lorg/anddev/andengine/util/HorizontalAlign;)V */
		 /* iput v1, p0, Lorg/anddev/andengine/entity/text/TickerText;->mCharactersVisible:I */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lorg/anddev/andengine/entity/text/TickerText;->mSecondsElapsed:F */
		 /* iput-boolean v1, p0, Lorg/anddev/andengine/entity/text/TickerText;->mReverse:Z */
		 (( org.anddev.andengine.entity.text.TickerText ) p0 ).setCharactersPerSecond ( p6 ); // invoke-virtual {p0, p6}, Lorg/anddev/andengine/entity/text/TickerText;->setCharactersPerSecond(F)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void drawVertices ( javax.microedition.khronos.opengles.GL10 p0, org.anddev.andengine.engine.camera.Camera p1 ) {
		 /* .locals 3 */
		 int v0 = 4; // const/4 v0, 0x4
		 int v1 = 0; // const/4 v1, 0x0
		 /* iget v2, p0, Lorg/anddev/andengine/entity/text/TickerText;->mCharactersVisible:I */
		 /* mul-int/lit8 v2, v2, 0x6 */
		 return;
	 } // .end method
	 public Float getCharactersPerSecond ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/text/TickerText;->mCharactersPerSecond:F */
	 } // .end method
	 public Integer getCharactersVisible ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/text/TickerText;->mCharactersVisible:I */
	 } // .end method
	 public Boolean isReverse ( ) {
		 /* .locals 1 */
		 /* iget-boolean v0, p0, Lorg/anddev/andengine/entity/text/TickerText;->mReverse:Z */
	 } // .end method
	 protected void onManagedUpdate ( Float p0 ) {
		 /* .locals 2 */
		 /* invoke-super {p0, p1}, Lorg/anddev/andengine/entity/text/Text;->onManagedUpdate(F)V */
		 /* iget-boolean v0, p0, Lorg/anddev/andengine/entity/text/TickerText;->mReverse:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* iget v0, p0, Lorg/anddev/andengine/entity/text/TickerText;->mCharactersVisible:I */
			 /* iget v1, p0, Lorg/anddev/andengine/entity/text/TickerText;->mCharactersMaximum:I */
			 /* if-ge v0, v1, :cond_0 */
			 int v0 = 0; // const/4 v0, 0x0
			 /* iget v1, p0, Lorg/anddev/andengine/entity/text/TickerText;->mSecondsElapsed:F */
			 /* sub-float/2addr v1, p1 */
			 v0 = 			 java.lang.Math .max ( v0,v1 );
			 /* iput v0, p0, Lorg/anddev/andengine/entity/text/TickerText;->mSecondsElapsed:F */
			 /* iget v0, p0, Lorg/anddev/andengine/entity/text/TickerText;->mSecondsElapsed:F */
			 /* iget v1, p0, Lorg/anddev/andengine/entity/text/TickerText;->mCharactersPerSecond:F */
			 /* mul-float/2addr v0, v1 */
			 /* float-to-int v0, v0 */
			 /* iput v0, p0, Lorg/anddev/andengine/entity/text/TickerText;->mCharactersVisible:I */
		 } // :cond_0
	 } // :goto_0
	 return;
} // :cond_1
/* iget v0, p0, Lorg/anddev/andengine/entity/text/TickerText;->mCharactersVisible:I */
/* iget v1, p0, Lorg/anddev/andengine/entity/text/TickerText;->mCharactersMaximum:I */
/* if-ge v0, v1, :cond_0 */
/* iget v0, p0, Lorg/anddev/andengine/entity/text/TickerText;->mDuration:F */
/* iget v1, p0, Lorg/anddev/andengine/entity/text/TickerText;->mSecondsElapsed:F */
/* add-float/2addr v1, p1 */
v0 = java.lang.Math .min ( v0,v1 );
/* iput v0, p0, Lorg/anddev/andengine/entity/text/TickerText;->mSecondsElapsed:F */
/* iget v0, p0, Lorg/anddev/andengine/entity/text/TickerText;->mSecondsElapsed:F */
/* iget v1, p0, Lorg/anddev/andengine/entity/text/TickerText;->mCharactersPerSecond:F */
/* mul-float/2addr v0, v1 */
/* float-to-int v0, v0 */
/* iput v0, p0, Lorg/anddev/andengine/entity/text/TickerText;->mCharactersVisible:I */
} // .end method
public void reset ( ) {
/* .locals 2 */
int v1 = 0; // const/4 v1, 0x0
/* invoke-super {p0}, Lorg/anddev/andengine/entity/text/Text;->reset()V */
/* iput v1, p0, Lorg/anddev/andengine/entity/text/TickerText;->mCharactersVisible:I */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lorg/anddev/andengine/entity/text/TickerText;->mSecondsElapsed:F */
/* iput-boolean v1, p0, Lorg/anddev/andengine/entity/text/TickerText;->mReverse:Z */
return;
} // .end method
public void setCharactersPerSecond ( Float p0 ) {
/* .locals 2 */
/* iput p1, p0, Lorg/anddev/andengine/entity/text/TickerText;->mCharactersPerSecond:F */
/* iget v0, p0, Lorg/anddev/andengine/entity/text/TickerText;->mCharactersMaximum:I */
/* int-to-float v0, v0 */
/* iget v1, p0, Lorg/anddev/andengine/entity/text/TickerText;->mCharactersPerSecond:F */
/* mul-float/2addr v0, v1 */
/* iput v0, p0, Lorg/anddev/andengine/entity/text/TickerText;->mDuration:F */
return;
} // .end method
public void setReverse ( Boolean p0 ) {
/* .locals 0 */
/* iput-boolean p1, p0, Lorg/anddev/andengine/entity/text/TickerText;->mReverse:Z */
return;
} // .end method
