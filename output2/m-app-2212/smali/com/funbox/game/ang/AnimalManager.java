class com.funbox.game.ang.AnimalManager {
	 /* .source "AnimalManager.java" */
	 /* # instance fields */
	 public final Integer MAX_ANIMAL_CNT;
	 private java.util.ArrayList mAnimalArray;
	 /* # direct methods */
	 public com.funbox.game.ang.AnimalManager ( ) {
		 /* .locals 5 */
		 /* .prologue */
		 /* const/16 v4, 0x9 */
		 /* .line 13 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 10 */
		 /* iput v4, p0, Lcom/funbox/game/ang/AnimalManager;->MAX_ANIMAL_CNT:I */
		 /* .line 14 */
		 /* new-instance v3, Ljava/util/ArrayList; */
		 /* invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V */
		 this.mAnimalArray = v3;
		 /* .line 17 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .local v1, "i":I */
	 } // :goto_0
	 /* if-lt v1, v4, :cond_0 */
	 /* .line 23 */
	 return;
	 /* .line 18 */
} // :cond_0
(( com.funbox.game.ang.AnimalManager ) p0 ).getSiteByIdx ( v1 ); // invoke-virtual {p0, v1}, Lcom/funbox/game/ang/AnimalManager;->getSiteByIdx(I)Lcom/funbox/game/ang/Animal$ANIMAL_SITE;
/* .line 20 */
/* .local v2, "site":Lcom/funbox/game/ang/Animal$ANIMAL_SITE; */
/* new-instance v0, Lcom/funbox/game/ang/Animal; */
/* invoke-direct {v0, v2}, Lcom/funbox/game/ang/Animal;-><init>(Lcom/funbox/game/ang/Animal$ANIMAL_SITE;)V */
/* .line 21 */
/* .local v0, "animal":Lcom/funbox/game/ang/Animal; */
v3 = this.mAnimalArray;
(( java.util.ArrayList ) v3 ).add ( v0 ); // invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 17 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
/* # virtual methods */
public Integer getAliveCnt ( ) {
/* .locals 5 */
/* .prologue */
/* .line 75 */
int v2 = 0; // const/4 v2, 0x0
/* .line 77 */
/* .local v2, "n":I */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "i":I */
} // :goto_0
v3 = this.mAnimalArray;
v3 = (( java.util.ArrayList ) v3 ).size ( ); // invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
/* if-lt v1, v3, :cond_0 */
/* .line 85 */
/* .line 78 */
} // :cond_0
(( com.funbox.game.ang.AnimalManager ) p0 ).getAnimal ( v1 ); // invoke-virtual {p0, v1}, Lcom/funbox/game/ang/AnimalManager;->getAnimal(I)Lcom/funbox/game/ang/Animal;
/* .line 79 */
/* .local v0, "animal":Lcom/funbox/game/ang/Animal; */
(( com.funbox.game.ang.Animal ) v0 ).getType ( ); // invoke-virtual {v0}, Lcom/funbox/game/ang/Animal;->getType()Lcom/funbox/game/ang/Animal$ANIMAL_TYPE;
v4 = com.funbox.game.ang.Animal$ANIMAL_TYPE.AT_BOMB;
/* if-eq v3, v4, :cond_1 */
/* .line 81 */
v3 = (( com.funbox.game.ang.Animal ) v0 ).getAlive ( ); // invoke-virtual {v0}, Lcom/funbox/game/ang/Animal;->getAlive()Z
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 82 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 77 */
} // :cond_1
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
public com.funbox.game.ang.Animal getAnimal ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "idx" # I */
/* .prologue */
/* .line 26 */
/* if-ltz p1, :cond_0 */
v0 = this.mAnimalArray;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* if-lt p1, v0, :cond_1 */
/* .line 27 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 30 */
} // .end local p0 # "this":Lcom/funbox/game/ang/AnimalManager;
} // :goto_0
/* .restart local p0 # "this":Lcom/funbox/game/ang/AnimalManager; */
} // :cond_1
v0 = this.mAnimalArray;
(( java.util.ArrayList ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
} // .end local p0 # "this":Lcom/funbox/game/ang/AnimalManager;
/* check-cast p0, Lcom/funbox/game/ang/Animal; */
/* move-object v0, p0 */
} // .end method
public Integer getNewAnimalIdxByRandom ( ) {
/* .locals 8 */
/* .prologue */
/* const/16 v7, 0x9 */
/* .line 35 */
/* new-array v5, v7, [I */
/* .line 37 */
/* .local v5, "tmpNum":[I */
int v2 = 0; // const/4 v2, 0x0
/* .line 38 */
/* .local v2, "n":I */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "i":I */
/* move v3, v2 */
} // .end local v2 # "n":I
/* .local v3, "n":I */
} // :goto_0
/* if-lt v0, v7, :cond_0 */
/* .line 43 */
/* new-instance v4, Ljava/util/Random; */
/* invoke-direct {v4}, Ljava/util/Random;-><init>()V */
/* .line 44 */
/* .local v4, "r":Ljava/util/Random; */
v1 = (( java.util.Random ) v4 ).nextInt ( v3 ); // invoke-virtual {v4, v3}, Ljava/util/Random;->nextInt(I)I
/* .line 45 */
/* .local v1, "idx":I */
/* aget v6, v5, v1 */
/* .line 39 */
} // .end local v1 # "idx":I
} // .end local v4 # "r":Ljava/util/Random;
} // :cond_0
(( com.funbox.game.ang.AnimalManager ) p0 ).getAnimal ( v0 ); // invoke-virtual {p0, v0}, Lcom/funbox/game/ang/AnimalManager;->getAnimal(I)Lcom/funbox/game/ang/Animal;
v6 = (( com.funbox.game.ang.Animal ) v6 ).getAlive ( ); // invoke-virtual {v6}, Lcom/funbox/game/ang/Animal;->getAlive()Z
/* if-nez v6, :cond_1 */
/* .line 40 */
/* add-int/lit8 v2, v3, 0x1 */
} // .end local v3 # "n":I
/* .restart local v2 # "n":I */
/* aput v0, v5, v3 */
/* .line 38 */
} // :goto_1
/* add-int/lit8 v0, v0, 0x1 */
/* move v3, v2 */
} // .end local v2 # "n":I
/* .restart local v3 # "n":I */
} // :cond_1
/* move v2, v3 */
} // .end local v3 # "n":I
/* .restart local v2 # "n":I */
} // .end method
public com.funbox.game.ang.Animal$ANIMAL_SITE getSiteByIdx ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "idx" # I */
/* .prologue */
/* .line 51 */
/* if-nez p1, :cond_0 */
/* .line 52 */
v0 = com.funbox.game.ang.Animal$ANIMAL_SITE.T1;
/* .line 71 */
/* .local v0, "site":Lcom/funbox/game/ang/Animal$ANIMAL_SITE; */
} // :goto_0
/* .line 53 */
} // .end local v0 # "site":Lcom/funbox/game/ang/Animal$ANIMAL_SITE;
} // :cond_0
int v1 = 1; // const/4 v1, 0x1
/* if-ne p1, v1, :cond_1 */
/* .line 54 */
v0 = com.funbox.game.ang.Animal$ANIMAL_SITE.T2;
/* .restart local v0 # "site":Lcom/funbox/game/ang/Animal$ANIMAL_SITE; */
/* .line 55 */
} // .end local v0 # "site":Lcom/funbox/game/ang/Animal$ANIMAL_SITE;
} // :cond_1
int v1 = 2; // const/4 v1, 0x2
/* if-ne p1, v1, :cond_2 */
/* .line 56 */
v0 = com.funbox.game.ang.Animal$ANIMAL_SITE.T3;
/* .restart local v0 # "site":Lcom/funbox/game/ang/Animal$ANIMAL_SITE; */
/* .line 57 */
} // .end local v0 # "site":Lcom/funbox/game/ang/Animal$ANIMAL_SITE;
} // :cond_2
int v1 = 3; // const/4 v1, 0x3
/* if-ne p1, v1, :cond_3 */
/* .line 58 */
v0 = com.funbox.game.ang.Animal$ANIMAL_SITE.M1;
/* .restart local v0 # "site":Lcom/funbox/game/ang/Animal$ANIMAL_SITE; */
/* .line 59 */
} // .end local v0 # "site":Lcom/funbox/game/ang/Animal$ANIMAL_SITE;
} // :cond_3
int v1 = 4; // const/4 v1, 0x4
/* if-ne p1, v1, :cond_4 */
/* .line 60 */
v0 = com.funbox.game.ang.Animal$ANIMAL_SITE.M2;
/* .restart local v0 # "site":Lcom/funbox/game/ang/Animal$ANIMAL_SITE; */
/* .line 61 */
} // .end local v0 # "site":Lcom/funbox/game/ang/Animal$ANIMAL_SITE;
} // :cond_4
int v1 = 5; // const/4 v1, 0x5
/* if-ne p1, v1, :cond_5 */
/* .line 62 */
v0 = com.funbox.game.ang.Animal$ANIMAL_SITE.M3;
/* .restart local v0 # "site":Lcom/funbox/game/ang/Animal$ANIMAL_SITE; */
/* .line 63 */
} // .end local v0 # "site":Lcom/funbox/game/ang/Animal$ANIMAL_SITE;
} // :cond_5
int v1 = 6; // const/4 v1, 0x6
/* if-ne p1, v1, :cond_6 */
/* .line 64 */
v0 = com.funbox.game.ang.Animal$ANIMAL_SITE.B1;
/* .restart local v0 # "site":Lcom/funbox/game/ang/Animal$ANIMAL_SITE; */
/* .line 65 */
} // .end local v0 # "site":Lcom/funbox/game/ang/Animal$ANIMAL_SITE;
} // :cond_6
int v1 = 7; // const/4 v1, 0x7
/* if-ne p1, v1, :cond_7 */
/* .line 66 */
v0 = com.funbox.game.ang.Animal$ANIMAL_SITE.B2;
/* .restart local v0 # "site":Lcom/funbox/game/ang/Animal$ANIMAL_SITE; */
/* .line 67 */
} // .end local v0 # "site":Lcom/funbox/game/ang/Animal$ANIMAL_SITE;
} // :cond_7
/* const/16 v1, 0x8 */
/* if-ne p1, v1, :cond_8 */
/* .line 68 */
v0 = com.funbox.game.ang.Animal$ANIMAL_SITE.B3;
/* .restart local v0 # "site":Lcom/funbox/game/ang/Animal$ANIMAL_SITE; */
/* .line 70 */
} // .end local v0 # "site":Lcom/funbox/game/ang/Animal$ANIMAL_SITE;
} // :cond_8
v0 = com.funbox.game.ang.Animal$ANIMAL_SITE.M2;
/* .restart local v0 # "site":Lcom/funbox/game/ang/Animal$ANIMAL_SITE; */
} // .end method
