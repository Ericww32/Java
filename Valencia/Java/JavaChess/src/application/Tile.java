package application;

public abstract class Tile {
	int tileLoc;//tile location 
	
	public Tile(int tileLoc){
		this.tileLoc = tileLoc;
	}
	
	public abstract boolean isTileFull();
	
	public abstract Piece getPiece();
	
	public static final class EmptyTile extends Tile{//inheritance
		EmptyTile(int location){
			super(location);
		}
		
		@Override
		public boolean isTileFull(){
			return false;
		}
		
		@Override
		public Piece getPiece(){
			return null;
		}
		
	}

	public static final class FullTile extends Tile{//inheritance
		Piece pieceOnTile;
		
		FullTile(int tileLoc, Piece pieceOnTile){
			super(tileLoc);
			this.pieceOnTile = pieceOnTile;
		}
		@Override
		public boolean isTileFull(){
			return true;
		}
		
		@Override
		public Piece getPiece(){
			return this.pieceOnTile;
		}
		
	}
}
