var resources = function (page, meta) {
	var log = new Log();
	return {
		js: ['bootstrap-select.min.js'],
		css: ['bootstrap-select.min.css']
	};

};

var selectCategory = function (data) {
	var selected,
		arr = [],
		currentCategory = data.artifact.attributes['overview_category'],
		categories = selectCategories(data.data.fields);

	for (var i in categories) {
		selected = (currentCategory == categories[i]) ? true : false;
		arr.push({
			cat: categories[i],
			sel: selected
		});
	}
	data.categorySelect = arr;
	return data;
};

var selectCategories = function (fields) {
	for (var i in fields) {
		if (fields[i].name == "overview_category") {
			return fields[i].valueList;
		}
	}
};

var screenshots = function (data) {
	var screens = data.artifact.attributes.images_screenshots;
	var shots = screens.split(",");
	data.artifact.attributes.images_screenshots = shots;
	return data;
};
