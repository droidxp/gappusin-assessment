class org.nwhy.Whackczkm.GameView$2 implements java.lang.Runnable {
	 /* .source "GameView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lorg/nwhy/Whackczkm/GameView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final org.nwhy.Whackczkm.GameView this$0; //synthetic
/* # direct methods */
 org.nwhy.Whackczkm.GameView$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 171 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 9 */
/* .prologue */
int v8 = 1; // const/4 v8, 0x1
/* .line 173 */
/* new-instance v3, Ljava/util/LinkedList; */
/* invoke-direct {v3}, Ljava/util/LinkedList;-><init>()V */
/* .line 174 */
/* .local v3, "temp":Ljava/util/LinkedList;, "Ljava/util/LinkedList<Lorg/nwhy/Whackczkm/Pic;>;" */
v6 = this.this$0;
org.nwhy.Whackczkm.GameView .access$0 ( v6 );
} // :cond_0
v7 = } // :goto_0
/* if-nez v7, :cond_3 */
/* .line 179 */
v2 = (( java.util.LinkedList ) v3 ).size ( ); // invoke-virtual {v3}, Ljava/util/LinkedList;->size()I
/* .line 180 */
/* .local v2, "size":I */
/* if-ne v2, v8, :cond_4 */
/* .line 181 */
(( java.util.LinkedList ) v3 ).poll ( ); // invoke-virtual {v3}, Ljava/util/LinkedList;->poll()Ljava/lang/Object;
/* check-cast v6, Lorg/nwhy/Whackczkm/Pic; */
(( org.nwhy.Whackczkm.Pic ) v6 ).toShow ( ); // invoke-virtual {v6}, Lorg/nwhy/Whackczkm/Pic;->toShow()V
/* .line 182 */
v6 = this.this$0;
(( org.nwhy.Whackczkm.GameView ) v6 ).invalidate ( ); // invoke-virtual {v6}, Lorg/nwhy/Whackczkm/GameView;->invalidate()V
/* .line 189 */
} // :cond_1
} // :goto_1
v6 = this.this$0;
int v7 = 0; // const/4 v7, 0x0
org.nwhy.Whackczkm.GameView .access$2 ( v6,v7 );
/* .line 191 */
/* const/16 v6, 0x7d0 */
v7 = this.this$0;
v7 = org.nwhy.Whackczkm.GameView .access$3 ( v7 );
/* mul-int/lit8 v7, v7, 0x50 */
/* sub-int/2addr v6, v7 */
/* int-to-long v4, v6 */
/* .line 192 */
/* .local v4, "time":J */
/* const-wide/16 v6, 0xfa */
/* cmp-long v6, v4, v6 */
/* if-gez v6, :cond_2 */
/* .line 193 */
/* const-wide/16 v4, 0xfa */
/* .line 195 */
} // :cond_2
v6 = this.this$0;
org.nwhy.Whackczkm.GameView .access$1 ( );
/* const/16 v8, 0x1f4 */
v7 = (( java.util.Random ) v7 ).nextInt ( v8 ); // invoke-virtual {v7, v8}, Ljava/util/Random;->nextInt(I)I
/* int-to-long v7, v7 */
/* add-long/2addr v7, v4 */
(( org.nwhy.Whackczkm.GameView ) v6 ).postDelayed ( p0, v7, v8 ); // invoke-virtual {v6, p0, v7, v8}, Lorg/nwhy/Whackczkm/GameView;->postDelayed(Ljava/lang/Runnable;J)Z
/* .line 196 */
return;
/* .line 174 */
} // .end local v2 # "size":I
} // .end local v4 # "time":J
} // :cond_3
/* check-cast v0, Lorg/nwhy/Whackczkm/Pic; */
/* .line 175 */
/* .local v0, "each":Lorg/nwhy/Whackczkm/Pic; */
/* iget v7, v0, Lorg/nwhy/Whackczkm/Pic;->currentType:I */
/* if-nez v7, :cond_0 */
/* .line 176 */
(( java.util.LinkedList ) v3 ).add ( v0 ); // invoke-virtual {v3, v0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
/* .line 183 */
} // .end local v0 # "each":Lorg/nwhy/Whackczkm/Pic;
/* .restart local v2 # "size":I */
} // :cond_4
/* if-le v2, v8, :cond_1 */
/* .line 184 */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "i":I */
} // :goto_2
org.nwhy.Whackczkm.GameView .access$1 ( );
int v7 = 2; // const/4 v7, 0x2
v6 = (( java.util.Random ) v6 ).nextInt ( v7 ); // invoke-virtual {v6, v7}, Ljava/util/Random;->nextInt(I)I
/* add-int/lit8 v6, v6, 0x1 */
/* if-lt v1, v6, :cond_5 */
/* .line 187 */
v6 = this.this$0;
(( org.nwhy.Whackczkm.GameView ) v6 ).invalidate ( ); // invoke-virtual {v6}, Lorg/nwhy/Whackczkm/GameView;->invalidate()V
/* .line 185 */
} // :cond_5
org.nwhy.Whackczkm.GameView .access$1 ( );
v7 = (( java.util.LinkedList ) v3 ).size ( ); // invoke-virtual {v3}, Ljava/util/LinkedList;->size()I
v6 = (( java.util.Random ) v6 ).nextInt ( v7 ); // invoke-virtual {v6, v7}, Ljava/util/Random;->nextInt(I)I
(( java.util.LinkedList ) v3 ).remove ( v6 ); // invoke-virtual {v3, v6}, Ljava/util/LinkedList;->remove(I)Ljava/lang/Object;
/* check-cast v6, Lorg/nwhy/Whackczkm/Pic; */
(( org.nwhy.Whackczkm.Pic ) v6 ).toShow ( ); // invoke-virtual {v6}, Lorg/nwhy/Whackczkm/Pic;->toShow()V
/* .line 184 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
