public class org.nwhy.Whackczkm.VSPic {
	 /* .source "VSPic.java" */
	 /* # static fields */
	 public static final Integer DOWN_HIT;
	 public static final Integer NOTHING;
	 public static final Integer UP_ONE;
	 /* # instance fields */
	 Integer currentType;
	 /* # direct methods */
	 public org.nwhy.Whackczkm.VSPic ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 3 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 7 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lorg/nwhy/Whackczkm/VSPic;->currentType:I */
		 /* .line 3 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean click ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 23 */
		 /* iget v0, p0, Lorg/nwhy/Whackczkm/VSPic;->currentType:I */
		 /* if-lez v0, :cond_0 */
		 /* .line 24 */
		 /* const/16 v0, -0x9 */
		 /* iput v0, p0, Lorg/nwhy/Whackczkm/VSPic;->currentType:I */
		 /* .line 25 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 27 */
	 } // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void toNext ( ) {
/* .locals 2 */
/* .prologue */
/* .line 10 */
/* iget v0, p0, Lorg/nwhy/Whackczkm/VSPic;->currentType:I */
/* if-lez v0, :cond_1 */
/* .line 11 */
/* iget v0, p0, Lorg/nwhy/Whackczkm/VSPic;->currentType:I */
int v1 = 1; // const/4 v1, 0x1
/* sub-int/2addr v0, v1 */
/* iput v0, p0, Lorg/nwhy/Whackczkm/VSPic;->currentType:I */
/* .line 16 */
} // :cond_0
} // :goto_0
return;
/* .line 13 */
} // :cond_1
/* iget v0, p0, Lorg/nwhy/Whackczkm/VSPic;->currentType:I */
/* if-gez v0, :cond_0 */
/* .line 14 */
/* iget v0, p0, Lorg/nwhy/Whackczkm/VSPic;->currentType:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lorg/nwhy/Whackczkm/VSPic;->currentType:I */
} // .end method
public void toShow ( ) {
/* .locals 1 */
/* .prologue */
/* .line 19 */
/* const/16 v0, 0xd */
/* iput v0, p0, Lorg/nwhy/Whackczkm/VSPic;->currentType:I */
/* .line 20 */
return;
} // .end method
