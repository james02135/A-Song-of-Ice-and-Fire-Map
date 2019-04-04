package application;

import java.io.File;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

public class MainController {
	
	Image origImage;
	
	File file;
	
	@FXML
	ImageView imageview;
	
	public void chooseImage() {//select a new image from the dialog box
		FileChooser fc = new FileChooser();
		fc.setTitle("Choose A File");
		file = fc.showOpenDialog(imageview.getScene().getWindow());// brings up the dialog window to choose a new image

		if (file != null) {
			origImage = new Image(file.toURI().toString());// Original Image, no changes
			imageview.setImage(origImage);
		} else {
			System.out.println("File is not valid");

		}
	}

}
