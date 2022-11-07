class com.funbox.game.ang.GameField {
	 /* .source "GameField.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/funbox/game/ang/GameField$GAME_STATUS; */
	 /* } */
} // .end annotation
/* # instance fields */
private Integer mHiScore;
private Integer mKillCntAddLife;
private Integer mKillCntPassLevel;
private Integer mLevel;
private Integer mLife;
private Integer mScore;
private com.funbox.game.ang.GameField$GAME_STATUS mStatus;
/* # direct methods */
public com.funbox.game.ang.GameField ( ) {
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 17 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 18 */
	 /* invoke-direct {p0}, Lcom/funbox/game/ang/GameField;->initData()V */
	 /* .line 19 */
	 return;
} // .end method
private Integer getCurLevelTask ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 101 */
	 /* iget v0, p0, Lcom/funbox/game/ang/GameField;->mLevel:I */
	 /* add-int/lit8 v0, v0, 0x4 */
} // .end method
private void initData ( ) {
	 /* .locals 2 */
	 /* .prologue */
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 22 */
	 int v0 = 3; // const/4 v0, 0x3
	 /* iput v0, p0, Lcom/funbox/game/ang/GameField;->mLife:I */
	 /* .line 23 */
	 int v0 = 1; // const/4 v0, 0x1
	 /* iput v0, p0, Lcom/funbox/game/ang/GameField;->mLevel:I */
	 /* .line 24 */
	 /* iput v1, p0, Lcom/funbox/game/ang/GameField;->mScore:I */
	 /* .line 25 */
	 /* iput v1, p0, Lcom/funbox/game/ang/GameField;->mHiScore:I */
	 /* .line 26 */
	 /* iput v1, p0, Lcom/funbox/game/ang/GameField;->mKillCntPassLevel:I */
	 /* .line 27 */
	 /* iput v1, p0, Lcom/funbox/game/ang/GameField;->mKillCntAddLife:I */
	 /* .line 29 */
	 v0 = com.funbox.game.ang.GameField$GAME_STATUS.GS_READY;
	 this.mStatus = v0;
	 /* .line 30 */
	 return;
} // .end method
/* # virtual methods */
public void addLife ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 48 */
	 /* iget v0, p0, Lcom/funbox/game/ang/GameField;->mLife:I */
	 /* add-int/lit8 v0, v0, 0x1 */
	 /* iput v0, p0, Lcom/funbox/game/ang/GameField;->mLife:I */
	 /* .line 49 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* iput v0, p0, Lcom/funbox/game/ang/GameField;->mKillCntAddLife:I */
	 /* .line 50 */
	 return;
} // .end method
public void addScore ( ) {
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 61 */
	 /* iget v0, p0, Lcom/funbox/game/ang/GameField;->mLife:I */
	 /* if-nez v0, :cond_1 */
	 /* .line 76 */
} // :cond_0
} // :goto_0
return;
/* .line 64 */
} // :cond_1
/* iget v0, p0, Lcom/funbox/game/ang/GameField;->mScore:I */
/* iget v1, p0, Lcom/funbox/game/ang/GameField;->mLevel:I */
/* mul-int/lit8 v1, v1, 0x5 */
/* add-int/2addr v0, v1 */
/* iput v0, p0, Lcom/funbox/game/ang/GameField;->mScore:I */
/* .line 65 */
/* iget v0, p0, Lcom/funbox/game/ang/GameField;->mKillCntPassLevel:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lcom/funbox/game/ang/GameField;->mKillCntPassLevel:I */
v1 = /* invoke-direct {p0}, Lcom/funbox/game/ang/GameField;->getCurLevelTask()I */
/* if-lt v0, v1, :cond_2 */
/* .line 66 */
/* iget v0, p0, Lcom/funbox/game/ang/GameField;->mLevel:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lcom/funbox/game/ang/GameField;->mLevel:I */
/* .line 67 */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/funbox/game/ang/GameField;->mKillCntPassLevel:I */
/* .line 71 */
} // :cond_2
/* iget v0, p0, Lcom/funbox/game/ang/GameField;->mLevel:I */
/* const/16 v1, 0x8 */
/* if-lt v0, v1, :cond_0 */
/* .line 72 */
/* iget v0, p0, Lcom/funbox/game/ang/GameField;->mKillCntAddLife:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lcom/funbox/game/ang/GameField;->mKillCntAddLife:I */
/* const/16 v1, 0x14 */
/* if-ne v0, v1, :cond_0 */
/* .line 73 */
(( com.funbox.game.ang.GameField ) p0 ).addLife ( ); // invoke-virtual {p0}, Lcom/funbox/game/ang/GameField;->addLife()V
} // .end method
public Boolean decLife ( ) {
/* .locals 3 */
/* .prologue */
int v2 = 1; // const/4 v2, 0x1
int v1 = 0; // const/4 v1, 0x0
/* .line 40 */
/* iget v0, p0, Lcom/funbox/game/ang/GameField;->mLife:I */
/* sub-int/2addr v0, v2 */
/* iput v0, p0, Lcom/funbox/game/ang/GameField;->mLife:I */
/* if-gtz v0, :cond_0 */
/* move v0, v1 */
/* .line 44 */
} // :goto_0
/* .line 43 */
} // :cond_0
/* iput v1, p0, Lcom/funbox/game/ang/GameField;->mKillCntAddLife:I */
/* move v0, v2 */
/* .line 44 */
} // .end method
public Integer getHiScore ( ) {
/* .locals 1 */
/* .prologue */
/* .line 83 */
/* iget v0, p0, Lcom/funbox/game/ang/GameField;->mHiScore:I */
} // .end method
public Integer getLevel ( ) {
/* .locals 1 */
/* .prologue */
/* .line 57 */
/* iget v0, p0, Lcom/funbox/game/ang/GameField;->mLevel:I */
} // .end method
public Integer getLife ( ) {
/* .locals 1 */
/* .prologue */
/* .line 53 */
/* iget v0, p0, Lcom/funbox/game/ang/GameField;->mLife:I */
} // .end method
public Integer getScore ( ) {
/* .locals 1 */
/* .prologue */
/* .line 79 */
/* iget v0, p0, Lcom/funbox/game/ang/GameField;->mScore:I */
} // .end method
public com.funbox.game.ang.GameField$GAME_STATUS getStatus ( ) {
/* .locals 1 */
/* .prologue */
/* .line 87 */
v0 = this.mStatus;
} // .end method
public void restoreData ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 0 */
/* .param p1, "life" # I */
/* .param p2, "score" # I */
/* .param p3, "level" # I */
/* .prologue */
/* .line 95 */
/* iput p1, p0, Lcom/funbox/game/ang/GameField;->mLife:I */
/* .line 96 */
/* iput p2, p0, Lcom/funbox/game/ang/GameField;->mScore:I */
/* .line 97 */
/* iput p3, p0, Lcom/funbox/game/ang/GameField;->mLevel:I */
/* .line 98 */
return;
} // .end method
public void setStatus ( com.funbox.game.ang.GameField$GAME_STATUS p0 ) {
/* .locals 0 */
/* .param p1, "gs" # Lcom/funbox/game/ang/GameField$GAME_STATUS; */
/* .prologue */
/* .line 91 */
this.mStatus = p1;
/* .line 92 */
return;
} // .end method
