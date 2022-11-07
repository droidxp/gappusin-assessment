public class org.anddev.andengine.entity.text.ChangeableText extends org.anddev.andengine.entity.text.Text {
	 /* # static fields */
	 private static final java.lang.String ELLIPSIS;
	 private static final Integer ELLIPSIS_CHARACTER_COUNT;
	 /* # instance fields */
	 private Integer mCharacterCountCurrentText;
	 /* # direct methods */
	 static org.anddev.andengine.entity.text.ChangeableText ( ) {
		 /* .locals 1 */
		 final String v0 = "..."; // const-string v0, "..."
		 v0 = 		 (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.text.ChangeableText ( ) {
		 /* .locals 6 */
		 v0 = 		 (( java.lang.String ) p4 ).length ( ); // invoke-virtual {p4}, Ljava/lang/String;->length()I
		 /* const/16 v1, 0xa */
		 v1 = 		 org.anddev.andengine.util.StringUtils .countOccurrences ( p4,v1 );
		 /* sub-int v5, v0, v1 */
		 /* move-object v0, p0 */
		 /* move v1, p1 */
		 /* move v2, p2 */
		 /* move-object v3, p3 */
		 /* move-object v4, p4 */
		 /* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/entity/text/ChangeableText;-><init>(FFLorg/anddev/andengine/opengl/font/Font;Ljava/lang/String;I)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.text.ChangeableText ( ) {
		 /* .locals 7 */
		 v5 = org.anddev.andengine.util.HorizontalAlign.LEFT;
		 /* move-object v0, p0 */
		 /* move v1, p1 */
		 /* move v2, p2 */
		 /* move-object v3, p3 */
		 /* move-object v4, p4 */
		 /* move v6, p5 */
		 /* invoke-direct/range {v0 ..v6}, Lorg/anddev/andengine/entity/text/ChangeableText;-><init>(FFLorg/anddev/andengine/opengl/font/Font;Ljava/lang/String;Lorg/anddev/andengine/util/HorizontalAlign;I)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.text.ChangeableText ( ) {
		 /* .locals 2 */
		 /* invoke-direct/range {p0 ..p6}, Lorg/anddev/andengine/entity/text/Text;-><init>(FFLorg/anddev/andengine/opengl/font/Font;Ljava/lang/String;Lorg/anddev/andengine/util/HorizontalAlign;I)V */
		 v0 = 		 (( java.lang.String ) p4 ).length ( ); // invoke-virtual {p4}, Ljava/lang/String;->length()I
		 /* const/16 v1, 0xa */
		 v1 = 		 org.anddev.andengine.util.StringUtils .countOccurrences ( p4,v1 );
		 /* sub-int/2addr v0, v1 */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/text/ChangeableText;->mCharacterCountCurrentText:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void drawVertices ( javax.microedition.khronos.opengles.GL10 p0, org.anddev.andengine.engine.camera.Camera p1 ) {
		 /* .locals 3 */
		 int v0 = 4; // const/4 v0, 0x4
		 int v1 = 0; // const/4 v1, 0x0
		 /* iget v2, p0, Lorg/anddev/andengine/entity/text/ChangeableText;->mCharacterCountCurrentText:I */
		 /* mul-int/lit8 v2, v2, 0x6 */
		 return;
	 } // .end method
	 public void setText ( java.lang.String p0 ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 (( org.anddev.andengine.entity.text.ChangeableText ) p0 ).setText ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lorg/anddev/andengine/entity/text/ChangeableText;->setText(Ljava/lang/String;Z)V
		 return;
	 } // .end method
	 public void setText ( java.lang.String p0, Boolean p1 ) {
		 /* .locals 3 */
		 int v2 = 0; // const/4 v2, 0x0
		 v0 = 		 (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
		 /* const/16 v1, 0xa */
		 v1 = 		 org.anddev.andengine.util.StringUtils .countOccurrences ( p1,v1 );
		 /* sub-int/2addr v0, v1 */
		 /* iget v1, p0, Lorg/anddev/andengine/entity/text/ChangeableText;->mCharactersMaximum:I */
		 /* if-le v0, v1, :cond_1 */
		 if ( p2 != null) { // if-eqz p2, :cond_0
			 /* iget v0, p0, Lorg/anddev/andengine/entity/text/ChangeableText;->mCharactersMaximum:I */
			 /* if-le v0, v1, :cond_0 */
			 /* iget v0, p0, Lorg/anddev/andengine/entity/text/ChangeableText;->mCharactersMaximum:I */
			 /* sub-int/2addr v0, v1 */
			 (( java.lang.String ) p1 ).substring ( v2, v0 ); // invoke-virtual {p1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
			 final String v1 = "..."; // const-string v1, "..."
			 (( java.lang.String ) v0 ).concat ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
			 (( org.anddev.andengine.entity.text.ChangeableText ) p0 ).updateText ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/entity/text/ChangeableText;->updateText(Ljava/lang/String;)V
		 } // :goto_0
		 /* iget v0, p0, Lorg/anddev/andengine/entity/text/ChangeableText;->mCharactersMaximum:I */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/text/ChangeableText;->mCharacterCountCurrentText:I */
	 } // :goto_1
	 return;
} // :cond_0
/* iget v0, p0, Lorg/anddev/andengine/entity/text/ChangeableText;->mCharactersMaximum:I */
(( java.lang.String ) p1 ).substring ( v2, v0 ); // invoke-virtual {p1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
(( org.anddev.andengine.entity.text.ChangeableText ) p0 ).updateText ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/entity/text/ChangeableText;->updateText(Ljava/lang/String;)V
} // :cond_1
(( org.anddev.andengine.entity.text.ChangeableText ) p0 ).updateText ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/entity/text/ChangeableText;->updateText(Ljava/lang/String;)V
/* iput v0, p0, Lorg/anddev/andengine/entity/text/ChangeableText;->mCharacterCountCurrentText:I */
} // .end method
