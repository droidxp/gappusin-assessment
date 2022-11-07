public class org.nwhy.Whackczkm.Pic {
	 /* .source "Pic.java" */
	 /* # static fields */
	 public static final Integer DOWN_HIT;
	 public static final Integer NOTHING;
	 public static final Integer UP_ONE;
	 /* # instance fields */
	 Integer currentType;
	 /* # direct methods */
	 public org.nwhy.Whackczkm.Pic ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 3 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 7 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lorg/nwhy/Whackczkm/Pic;->currentType:I */
		 /* .line 3 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean click ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 26 */
		 /* iget v0, p0, Lorg/nwhy/Whackczkm/Pic;->currentType:I */
		 /* if-lez v0, :cond_0 */
		 /* .line 27 */
		 /* const/16 v0, -0x9 */
		 /* iput v0, p0, Lorg/nwhy/Whackczkm/Pic;->currentType:I */
		 /* .line 28 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 30 */
	 } // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void toNext ( ) {
/* .locals 3 */
/* .prologue */
int v2 = 1; // const/4 v2, 0x1
/* .line 10 */
/* iget v0, p0, Lorg/nwhy/Whackczkm/Pic;->currentType:I */
/* if-lez v0, :cond_1 */
/* .line 11 */
/* iget v0, p0, Lorg/nwhy/Whackczkm/Pic;->currentType:I */
/* sub-int/2addr v0, v2 */
/* iput v0, p0, Lorg/nwhy/Whackczkm/Pic;->currentType:I */
/* .line 12 */
/* iget v0, p0, Lorg/nwhy/Whackczkm/Pic;->currentType:I */
/* if-nez v0, :cond_0 */
/* .line 13 */
v0 = org.nwhy.Whackczkm.GameView.self;
/* iget v1, v0, Lorg/nwhy/Whackczkm/GameView;->hp:I */
/* sub-int/2addr v1, v2 */
/* iput v1, v0, Lorg/nwhy/Whackczkm/GameView;->hp:I */
/* .line 19 */
} // :cond_0
} // :goto_0
return;
/* .line 16 */
} // :cond_1
/* iget v0, p0, Lorg/nwhy/Whackczkm/Pic;->currentType:I */
/* if-gez v0, :cond_0 */
/* .line 17 */
/* iget v0, p0, Lorg/nwhy/Whackczkm/Pic;->currentType:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lorg/nwhy/Whackczkm/Pic;->currentType:I */
} // .end method
public void toShow ( ) {
/* .locals 1 */
/* .prologue */
/* .line 22 */
/* const/16 v0, 0xd */
/* iput v0, p0, Lorg/nwhy/Whackczkm/Pic;->currentType:I */
/* .line 23 */
return;
} // .end method
